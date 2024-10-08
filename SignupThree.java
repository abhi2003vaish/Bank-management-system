
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
        JLabel l1=new JLabel("page-3 Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        JLabel type=new JLabel("Account Type ");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,40);
        add(type);
        
        r1=new JRadioButton("SavingsAccount");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        
         r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,150,20);
        add(r2);
        
        
         r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);
        
        
         r4=new JRadioButton("Recurring deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,150,20);
        add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        
         JLabel number=new JLabel("XXXX-XXXX-XXXX-5166");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        
        JLabel details=new JLabel("your 16 digit card number");
        details.setFont(new Font("Raleway",Font.BOLD,12));
        details.setBounds(100,330,300,20);
        add(details);
        
        
        JLabel pin=new JLabel("pin Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        
         JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pdetails=new JLabel("your 4 digit pin number");
        pdetails.setFont(new Font("Raleway",Font.BOLD,12));
        pdetails.setBounds(100,400,300,20);
        add(pdetails);
        
        
        
        JLabel services=new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);
        
        c1=new JCheckBox("ATM-CARD");
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,500,200,30);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        add(c1);
        
        
        c2=new JCheckBox("INTERNET-BANKING");
        c2.setBackground(Color.WHITE);
        c2.setBounds(350,500,200,30);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        add(c2);
        
        
        c3=new JCheckBox("MOBILE-BANKING");
        c3.setBackground(Color.WHITE);
        c3.setBounds(100,550,230,30);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        add(c3);
        
        
        
        c4=new JCheckBox("EMAIL & SMS ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setBounds(350,550,200,30);
        c4.setFont(new Font("raleway",Font.BOLD,16));
        add(c4);
        
        
        c5=new JCheckBox("CHECKBOOK");
        c5.setBackground(Color.WHITE);
        c5.setBounds(100,600,200,30);
        c5.setFont(new Font("raleway",Font.BOLD,16));
        add(c5);
        
        
        c6=new JCheckBox("e-STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setBounds(350,500,200,30);
        c6.setFont(new Font("raleway",Font.BOLD,16));
        add(c6);
        
        
        c7=new JCheckBox("I HEREBY declare that the above mentioned details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setBounds(100,680,600,30);
        c7.setFont(new Font("raleway",Font.BOLD,12));
        add(c7);
        
        submit=new JButton("submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        
         cancel=new JButton("cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.YELLOW);
        
      setSize(850,820);
      setLocation(350,0);
      setVisible(true);
    }
    
    
    
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== submit){
            String accountype=null;
            if(r1.isSelected()){
                accountype="savings account";
            }
           else if(r2.isSelected()){
                accountype="fixed deposit account";
            }
            else if(r3.isSelected()){
                accountype=" current account";
            }
            else if(r4.isSelected()){
                accountype=" recurring Deposit account";
            }
            Random random =new Random();
            String cardnumber =""+Math.abs((random.nextLong() %90000000L)  + 50409360000000000L);
            String pinnumber= ""+Math.abs((random.nextLong() %9000L)  + 1000L);  
            String facility="";
            if(c1.isSelected())
            {
                facility=facility+"ATM-CARD";
            }
           else if(c2.isSelected())
            {
                facility=facility+"INTERNET-BANKING";
            }
          else  if(c3.isSelected())
            {
                facility=facility+"MOBILE_BANKING";
                
            }
          else  if(c4.isSelected())
            {
                facility=facility+"EMAIL & SMS SERVICES";
            }
          else  if(c5.isSelected())
            {
                facility=facility+"CHEQUEBOOK";
            }
          else  if(c6.isSelected())
            {
                facility=facility+"e-STATEMENT";
            }
            
            try
            {
               if(accountype.equals("")) {
                   JOptionPane.showMessageDialog(null, "Account type is required");
               }
               else
               {
                   Conn conn=new Conn();
                   String Query1="insert into signupthree values('"+formno+"','"+accountype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String Query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                   conn.st.executeUpdate(Query1);
                   conn.st.executeUpdate(Query2);
                   JOptionPane.showMessageDialog(null,"CARD NUMBER:"+ cardnumber+"\n PIN:"+pinnumber);
                   setVisible(false);
                   new deposit(pinnumber).setVisible(false);
               }
            } catch (Exception ae)
            {
                System.out.println(ae);
            }
            } else if(e.getSource()==cancel){
                    setVisible(false);
                    new login().setVisible(true);
                    }
        
        
        
        
        
    }
    public static void main(String []args)
    {
        new SignupThree("");
    }

    
    }
