package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class withdrawl1 extends JFrame implements ActionListener {
    JButton withdraw, back;
    JTextField amount;
    String pinnumber;

    public withdrawl1(String pinNumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon atmIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image scaledImage = atmIcon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel image = new JLabel(scaledIcon);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setBounds(170, 300, 400, 20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == withdraw) {
            String number = amount.getText().trim();
            if (number.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            } else {
                try {
                    double withdrawalAmount = Double.parseDouble(number);
                    Date date = new Date();
                    // Assuming Conn class handles database connection
                    Conn conn = new Conn();
                    String query = "INSERT INTO bank VALUES('" + pinnumber + "','" + date + "','withdraw','" + withdrawalAmount + "')";
                    conn.st.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs" + number + " withdrawn successfully");
                    setVisible(false);
                    new transaction(pinnumber).setVisible(true);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numerical amount");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
           new transaction(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new withdrawl1("");
    }
}
