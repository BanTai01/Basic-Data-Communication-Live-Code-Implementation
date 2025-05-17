import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;

public class Home1 extends javax.swing.JFrame {

    public Home1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon img = new ImageIcon("p.jpg"); 
                g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select an Option", "Bit Stuffing", "Bit De-stuffing", "Character Stuffing",
            "Character De-Stuffing", "Dotted Decimal to Binary",
            "Binary to Dotted Decimal","IP Information", "IPv4 to IPv6", "Calculate Parity","Hamming Encode", 
            "Hamming Decode","Error Detection"
        }));

        jButton1.setBackground(new java.awt.Color(255, 104, 104));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jButton1.setText("Reset");

        jButton2.setBackground(new java.awt.Color(195, 255, 147));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jButton2.setText("Perform");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setText("Select Option");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel2.setForeground(Color.WHITE); // Set font color to white
        jLabel2.setText("Input");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setText("Output");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel6.setForeground(Color.WHITE);
        jLabel6.setText(":");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel8.setForeground(Color.WHITE);
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText("Flag");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20));
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setText(":");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel7.setForeground(Color.WHITE);
        jLabel7.setText("Basic Data Communication Live Code Implementation");
  
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSelectedTechnique();
            }
        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jComboBox1.setSelectedIndex(0);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2)
                        .addComponent(jComboBox1, 0, 271, Short.MAX_VALUE)
                        .addComponent(jTextField1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 622, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
                    .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING )
                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3)
                        .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(5, 5, 5)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1);
        pack();
    }
    public static String bitStuffing(int[] arr) {
        int N = arr.length;
        int[] brr = new int[2 * N];
        int i, j, k;
        i = 0;
        j = 0;
        int count = 0;
        
        while (i < N) {
            if (arr[i] == 1) {
                brr[j++] = arr[i];
                count++;
                if (count == 5) {
                    brr[j++] = 0;
                    count = 0;
                }
            } else {
                brr[j++] = arr[i];
                count = 0;
            }
            i++;
        }

        StringBuilder output = new StringBuilder();
        for (i = 0; i < j; i++) {
            output.append(brr[i]);
        }

        return output.toString();
    }

    private static String bitDestuffing(int[] arr) {
        int N = arr.length;
        int[] brr = new int[N]; 

        int i = 0, j = 0, count = 0; 

        while (i < N) {
            if (arr[i] == 1) {
                brr[j++] = arr[i]; 
                count++;
        
                if (count == 5) {
                    i++;
                    count = 0; 
                }
            } else {
                brr[j++] = arr[i];
                count = 0; 
            }
            i++;
        }

        StringBuilder output = new StringBuilder();
        for (i = 0; i < j; i++) {
            output.append(brr[i]);
        }

        return output.toString();
    }

    public static String characterStuffing(String data, String flag) {
        String ESCAPE = "ESC";
        StringBuilder stuffedData = new StringBuilder(flag);

        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i).startsWith(flag) || data.substring(i).startsWith(ESCAPE)) {
                stuffedData.append(ESCAPE);
            }
            stuffedData.append(data.charAt(i));
        }

        stuffedData.append(flag);
        return stuffedData.toString();
    }

    public static String characterDeStuffing(String data, String flag) {
        StringBuilder destuffedData = new StringBuilder();
        String ESCAPE = "ESC";
        int i = flag.length(); 
        while (i < data.length() - flag.length()) {
            if (data.substring(i).startsWith(ESCAPE)) {
                i += ESCAPE.length(); 
            }
            destuffedData.append(data.charAt(i));
            i++;
        }

        return destuffedData.toString();
    }

    private String dottedDecimalToBinary(String input) {
        String[] octets = input.split("\\.");
        if (octets.length != 4) return "Invalid IPv4 address.";

        StringBuilder binaryIP = new StringBuilder();
        for (String octet : octets) {
            try {
                int decimal = Integer.parseInt(octet);
                if (decimal < 0 || decimal > 255) return "Invalid IPv4 address.";
                String binary = Integer.toBinaryString(decimal);
                binaryIP.append(String.format("%08d", Integer.parseInt(binary)));
                binaryIP.append(".");
            } catch (NumberFormatException e) {
                return "Invalid IPv4 address.";
            }
        }

        return binaryIP.substring(0, binaryIP.length() - 1); }

    private String binaryToDottedDecimal(String input) {
        String[] octets = input.split("\\.");
        if (octets.length != 4) return "Invalid binary IP address.";

        StringBuilder decimalIP = new StringBuilder();
        for (String octet : octets) {
            try {
                if (octet.length() != 8) return "Invalid binary IP address.";
                int decimal = Integer.parseInt(octet, 2);
                decimalIP.append(decimal);
                decimalIP.append(".");
            } catch (NumberFormatException e) {
                return "Invalid binary IP address.";
            }
        }

        return decimalIP.substring(0, decimalIP.length() - 1); 
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

        return "IPv6 (short)--->  " + ipv6.toString();
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


    private String parityCheck(String inputData) {
        char[] data = new char[100];
        boolean isAllZeros = true;
    
        for (int i = 0; i < inputData.length(); i++) {
            data[i] = inputData.charAt(i);
            if (data[i] != '0') {
                isAllZeros = false;
            }
        }
    
        // Check if the input data is all zeros
        if (isAllZeros) {
            return "Invalid data";
        }
    
        // Finding the user data length
        int length = inputData.length();
        int count = 0;
    
        // Checking even parity
        for (int i = 0; i < length; i++) {
            if (data[i] == '1') {
                count++;
            }
        }
    
        // Increasing the array for adding the parity bit.
        int c = length + 1;
        char[] newData = new char[c];
    
        // Copying the original data to the new array
        for (int i = 0; i < length; i++) {
            newData[i] = data[i];
        }
    
        // Initializing the parity bit at the end
        if (count % 2 == 0) {
            newData[length] = '0';
        } else {
            newData[length] = '1';
        }
    
        // Build string output
        StringBuilder output = new StringBuilder();
        for (char c1 : newData) {
            if (c1 != '\0') {
                output.append(c1);
            }
        }
    
        return output.toString();
    }
    class HammingCode {

        public static String encode(String data) {
            int r = 0;
            while (Math.pow(2, r) < data.length() + r + 1) {
                r++;
            }
    
            int length = data.length() + r;
            char[] result = new char[length];
    
            int j = 0;
            for (int i = 1; i <= length; i++) {
                if (Math.pow(2, j) == i) {
                    result[i - 1] = 'P';
                    j++;
                } else {
                    result[i - 1] = data.charAt(i - j - 1);
                }
            }
    
            for (int i = 0; i < r; i++) {
                int parityBitPos = (int) Math.pow(2, i);
                int parity = 0;
    
                for (int k = 1; k <= length; k++) {
                    if (((k >> i) & 1) == 1 && k != parityBitPos) {
                        parity ^= result[k - 1] - '0';
                    }
                }
    
                result[parityBitPos - 1] = (char) (parity + '0');
            }
    
            return new String(result);
        }
        
        public static String detectError(String senderData, String flagData) {
            StringBuilder errorBits = new StringBuilder();
            int errorCount = 0;
        
            // Check for errors
            for (int i = 0; i < senderData.length(); i++) {
                if (senderData.charAt(i) != flagData.charAt(i)) {
                    if (errorBits.length() > 0) {
                        errorBits.append(", ");
                    }
                    errorBits.append(i + 1);
                    errorCount++;
                }
            }
        
            // Construct output
            if (errorCount > 1) {
                return "Invalid";
            } else if (errorCount == 1) {
                return "Error in bit number : " + errorBits.toString();
            } else {
                return "No error detected";
            }
        }
        
        
        public static String decode(String data) {
            int r = 0;
            while (Math.pow(2, r) < data.length() + 1) {
                r++;
            }
    
            int length = data.length();
            int errorPosition = 0;
    
            for (int i = 0; i < r; i++) {
                int parityBitPos = (int) Math.pow(2, i);
                int parity = 0;
    
                for (int k = 1; k <= length; k++) {
                    if (((k >> i) & 1) == 1) {
                        parity ^= data.charAt(k - 1) - '0';
                    }
                }
    
                if (parity != 0) {
                    errorPosition += parityBitPos;
                }
            }
    
            if (errorPosition > 0 && errorPosition <= length) {
                char[] correctedData = data.toCharArray();
                correctedData[errorPosition - 1] = (data.charAt(errorPosition - 1) == '0') ? '1' : '0';
                data = new String(correctedData);
            }
    
            StringBuilder originalData = new StringBuilder();
            int j = 0;
            for (int i = 1; i <= length; i++) {
                if (Math.pow(2, j) != i) {
                    originalData.append(data.charAt(i - 1));
                } else {
                    j++;
                }
            }
    
            return originalData.toString();
        }
    }
    
    
    
    private void performSelectedTechnique() {
        String input = jTextField1.getText();
        String flag = jTextField3.getText();
        String selectedOption = (String) jComboBox1.getSelectedItem();
        String output = "";

        if (selectedOption == null) {
            JOptionPane.showMessageDialog(this, "Please select an option.");
            return;
        }

        switch (selectedOption) {
            case "Bit Stuffing":
                // Convert input string to integer array
                int[] arr = new int[input.length()];
                for (int i = 0; i < input.length(); i++) {
                    arr[i] = Character.getNumericValue(input.charAt(i));
                }
                output = bitStuffing(arr);
                break;
            case "Bit De-stuffing":
                int[] deStuffingInputArray = new int[input.length()];
                for (int idx = 0; idx < input.length(); idx++) {
                    deStuffingInputArray[idx] = Character.getNumericValue(input.charAt(idx));
                }
                output = bitDestuffing(deStuffingInputArray);
                break;
            case "Character Stuffing":
                output = characterStuffing(input, flag);
                break;
            case "Character De-Stuffing":
                output = characterDeStuffing(input, flag);
                break;
            case "Dotted Decimal to Binary":
                output = dottedDecimalToBinary(input);
                break;
            case "Binary to Dotted Decimal":
                output = binaryToDottedDecimal(input);
                break;
            case "IPv4 to IPv6":
                output = ipv4ToIpv6(input);
                break;
            case "IP Information":
                output = ipInformation(input);
                break;
            case "Calculate Parity":
                output = parityCheck(input);
                break;
            case "Hamming Encode":
                output = HammingCode.encode(input);
                break;
            case "Hamming Decode":
                output = HammingCode.decode(input);
                break;
            case "Error Detection":
                output = HammingCode.detectError(input, flag);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid option selected.");
                return;
        }

        jTextField2.setText(output);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;


}
