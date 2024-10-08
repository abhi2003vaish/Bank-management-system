
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {
    
    JButton clear,signup,login2;
    JTextField cardTextField;JPasswordField pintextfield;
    login()
    {
        
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel label = new JLabel(i1);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
         JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        
         cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
         JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);
        
        pintextfield = new JPasswordField();
        pintextfield.setBounds(300,220,250,30);
         pintextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(pintextfield);
        
         login2 =new JButton("SIGN IN");
        login2.setBounds(300,300,100,30);
        login2.setBackground(Color.BLACK);
        login2.setForeground(Color.WHITE);
        login2.addActionListener(this);
        add(login2);
        
        
         clear =new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         signup =new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pintextfield.setText("");
        }
        else if(ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        else if(ae.getSource()== login2){
            Conn conn=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pintextfield.getText();
            String query="select * from login where cardnumber='"+cardnumber+"' and pinnumber='"+pinnumber+"'";
            try{
           ResultSet rs= conn.st.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new transaction(pinnumber).setVisible(true);}
               else{
                      JOptionPane.showMessageDialog(null, "incorrect card number or pin");
                       }
          
           
                    }catch(Exception e){
                        System.out.println(e);
                    }
        }
    }
    public static void main(String [] args)
    {
        new login();
    }
    
}
