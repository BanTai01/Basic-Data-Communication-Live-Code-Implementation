import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressAnalyzerTool extends JFrame {

    private JTextField inputField;
    private JTextField outputField;
    private JComboBox<String> optionsComboBox;

    public IPAddressAnalyzerTool() {
        setTitle("IP Address Analyzer Tool");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel inputLabel = new JLabel("Input:");
        inputLabel.setBounds(10, 20, 80, 25);
        panel.add(inputLabel);

        inputField = new JTextField(20);
        inputField.setBounds(100, 20, 350, 25);
        panel.add(inputField);

        JLabel outputLabel = new JLabel("Output:");
        outputLabel.setBounds(10, 60, 80, 25);
        panel.add(outputLabel);

        outputField = new JTextField(20);
        outputField.setBounds(100, 60, 350, 25);
        outputField.setEditable(false);
        panel.add(outputField);

        String[] options = {
                "IPv4 to IPv6",
                "IPv6 to IPv4",
                "Validate IP",
                "Subnet Calculation",
                "IP Information"
        };
        optionsComboBox = new JComboBox<>(options);
        optionsComboBox.setBounds(10, 100, 200, 25);
        panel.add(optionsComboBox);

        JButton analyzeButton = new JButton("Analyze");
        analyzeButton.setBounds(250, 100, 200, 25);
        panel.add(analyzeButton);

        analyzeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performSelectedFunction();
            }
        });
    }

    private void performSelectedFunction() {
        String selectedOption = (String) optionsComboBox.getSelectedItem();
        String input = inputField.getText();
        String output = "";

        switch (selectedOption) {
            case "IPv4 to IPv6":
                output = ipv4ToIpv6(input);
                break;
            case "IPv6 to IPv4":
                output = ipv6ToIpv4(input);
                break;
            case "Validate IP":
                output = validateIP(input);
                break;
            case "Subnet Calculation":
                output = subnetCalculation(input);
                break;
            case "IP Information":
                output = ipInformation(input);
                break;
            default:
                output = "Select a valid option.";
                break;
        }

        outputField.setText(output);
    }

    private String ipv4ToIpv6(String input) {
        String[] octets = input.split("\\.");
        if (octets.length != 4) return "Invalid IPv4 address.";

        StringBuilder ipv6 = new StringBuilder("::ffff:");
        for (int i = 0; i < octets.length; i++) {
            try {
                int value = Integer.parseInt(octets[i]);
                if (value < 0 || value > 255) return "Invalid IPv4 address.";
                ipv6.append(String.format("%02x", value));
                if (i % 2 == 1 && i < octets.length - 1) {
                    ipv6.append(":");
                }
            } catch (NumberFormatException e) {
                return "Invalid IPv4 address.";
            }
        }

        return "IPv6 (short) ---> " + ipv6.toString();
    }

    private String ipv6ToIpv4(String input) {
        if (input.startsWith("::ffff:")) {
            try {
                String[] hexPairs = input.substring(7).split(":");
                if (hexPairs.length != 2) return "Invalid IPv6 address.";
                String ipv4 = Integer.parseInt(hexPairs[0], 16) + "." + Integer.parseInt(hexPairs[1], 16);
                return "IPv4 ---> " + ipv4;
            } catch (NumberFormatException e) {
                return "Invalid IPv6 address.";
            }
        }
        return "IPv6 address is not an IPv4-mapped address.";
    }

    private String validateIP(String input) {
        try {
            InetAddress.getByName(input);
            return "Valid IP address.";
        } catch (UnknownHostException e) {
            return "Invalid IP address.";
        }
    }

    private String subnetCalculation(String input) {
        // Basic subnet calculation - split input into IP and subnet mask
        String[] parts = input.split("/");
        if (parts.length != 2) return "Invalid input format.";

        try {
            String ipAddress = parts[0];
            int prefixLength = Integer.parseInt(parts[1]);

            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            byte[] addressBytes = inetAddress.getAddress();
            int mask = 0xffffffff << (32 - prefixLength);

            byte[] maskBytes = new byte[] {
                    (byte) (mask >>> 24), (byte) (mask >> 16 & 0xff),
                    (byte) (mask >> 8 & 0xff), (byte) (mask & 0xff)
            };

            byte[] networkBytes = new byte[4];
            for (int i = 0; i < 4; i++) {
                networkBytes[i] = (byte) (addressBytes[i] & maskBytes[i]);
            }

            byte[] broadcastBytes = new byte[4];
            for (int i = 0; i < 4; i++) {
                broadcastBytes[i] = (byte) (addressBytes[i] | ~maskBytes[i]);
            }

            InetAddress networkAddress = InetAddress.getByAddress(networkBytes);
            InetAddress broadcastAddress = InetAddress.getByAddress(broadcastBytes);

            return "Network Address: " + networkAddress.getHostAddress() +
                    "\nBroadcast Address: " + broadcastAddress.getHostAddress();
        } catch (Exception e) {
            return "Invalid input.";
        }
    }

    private String ipInformation(String input) {
        try {
            InetAddress inetAddress = InetAddress.getByName(input);
            byte[] addressBytes = inetAddress.getAddress();

            if (addressBytes.length == 4) {  // IPv4
                int firstByte = addressBytes[0] & 0xFF;
                String type = "Public";
                if ((firstByte >= 10 && firstByte <= 10) ||
                        (firstByte >= 172 && firstByte <= 172 && (addressBytes[1] & 0xF0) == 16) ||
                        (firstByte >= 192 && firstByte <= 192 && addressBytes[1] == 168)) {
                    type = "Private";
                }
                return "IPv4 Address\nClass: " + getIPv4Class(firstByte) + "\nType: " + type;
            } else {  // IPv6
                return "IPv6 Address";
            }
        } catch (UnknownHostException e) {
            return "Invalid IP address.";
        }
    }

    private String getIPv4Class(int firstByte) {
        if (firstByte >= 0 && firstByte <= 127) return "A";
        if (firstByte >= 128 && firstByte <= 191) return "B";
        if (firstByte >= 192 && firstByte <= 223) return "C";
        if (firstByte >= 224 && firstByte <= 239) return "D";
        return "E";
    }

    public static void main(String[] args) {
        new IPAddressAnalyzerTool();
    }
}
