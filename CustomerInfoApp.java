import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerInfoApp extends JFrame {
    
    // Components
    private JTextField idField, lastNameField, firstNameField, phoneField;
    private JButton nextButton,preButton;
    
    public CustomerInfoApp() {
        super("Customer Information");
        
        // Initialize components
        idField = new JTextField(10);
        lastNameField = new JTextField(20);
        firstNameField = new JTextField(20);
        phoneField = new JTextField(15);
        preButton = new JButton("Preivous");
        nextButton = new JButton("Next");
        
        // Layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        panel.add(new JLabel("Customer ID:"), constraints);
        constraints.gridx++;
        panel.add(idField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy++;
        panel.add(new JLabel("Last Name:"), constraints);
        constraints.gridx++;
        panel.add(lastNameField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy++;
        panel.add(new JLabel("First Name:"), constraints);
        constraints.gridx++;
        panel.add(firstNameField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy++;
        panel.add(new JLabel("Phone:"), constraints);
        constraints.gridx++;
        panel.add(phoneField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy++;
        constraints.gridwidth = 2;
        panel.add(nextButton, constraints);

        constraints.gridx = 0;
        constraints.gridy++;
        constraints.gridwidth = 2;
        panel.add(preButton, constraints);
        
        // Button action
        nextButton.addActionListener(e -> showCustomerInfo());
        preButton.addActionListener(e -> showCustomerInfo());
        
        // Frame setup
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void showCustomerInfo() {
        String id = idField.getText();
        String lastName = lastNameField.getText();
        String firstName = firstNameField.getText();
        String phone = phoneField.getText();
        
        // Display customer information
        String message = String.format("Customer ID: %s\nLast Name: %s\nFirst Name: %s\nPhone: %s",
                                       id, lastName, firstName, phone);
        
        JOptionPane.showMessageDialog(this, message, "Customer Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CustomerInfoApp::new);
    }
}
