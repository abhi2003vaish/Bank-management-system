


package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,ayes,ano;
String formno;
    
    JComboBox religion,category,occupation,educational,income;
    SignupTwo(String formno){
this.formno=formno;
        setLayout(null);
       setTitle("new account application form - PAGE 2");
        
        
        JLabel additionaldetails = new JLabel("page 2: Additional Details");
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290,80,400,30);
        add(additionaldetails);
        
         JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valreligion[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
         religion =new JComboBox(valreligion);
        religion.setFont(new Font("Raleway",Font.BOLD,14));
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         String valcategory[]={"GENERAL","OBC","SC","ST","OTHERS"};
         category =new JComboBox(valcategory);
       
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);
        
        String valincome[]={"null","<1,50,000","<2,50,000","<5,00,000","UPTO 10,00,000"};
         income =new JComboBox(valincome);
       
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
                 
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
         JLabel Email = new JLabel("Qualification:");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,315,200,30);
        add(Email);
        
        
        String educationvalues[]={"NON-GRADUATE","GRADUATE","POST-GRADUATE","DOCTRATE","OTHERS"};
         educational =new JComboBox(educationvalues);
       
        educational.setBounds(300,290,400,30);
        educational.setBackground(Color.WHITE);
        add(educational);
        
               
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        String occupationvalues[]={"SALARIED","SELF-EMPLOYED","BUSINESS","STUDENT","RETIRED","OTHERS"};
        occupation =new JComboBox(occupationvalues);
       
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        
         JLabel address = new JLabel("PanNumber:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setBounds(300,440,400,30);
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        add(pan);
        
        
         
        
        
         JLabel state = new JLabel("Aadhar number:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        
         aadhar = new JTextField();
        aadhar.setBounds(300,540,400,30);
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        add(aadhar);
        
        
         JLabel pincode = new JLabel("Senior Citizen:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        
         syes = new JRadioButton("yes");
        syes.setBounds(300, 590, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        
        sno = new JRadioButton("no");
        sno.setBounds(450, 590, 100, 30);
             sno.setBackground(Color.WHITE);
        add(sno);
        
         
        
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
       
        
        JLabel city = new JLabel("Existing Account:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,640,200,30);
        add(city);
        
         ayes = new JRadioButton("yes");
        ayes.setBounds(300, 640, 100, 30);
        ayes.setBackground(Color.WHITE);
        add(ayes);
        
        
        ano = new JRadioButton("no");
        ano.setBounds(450, 640, 100, 30);
             ano.setBackground(Color.WHITE);
        add(ano);
        
         
        
        
        
        ButtonGroup ExistingAccount = new ButtonGroup();
        ExistingAccount.add(ayes);
        ExistingAccount.add(ano);
        
         next =new JButton("next");
        next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD, 14));
         next.setBounds(620, 660, 80, 30);
         next.addActionListener(this);
         add(next);
         
        getContentPane().setBackground(Color.WHITE);
        setSize(850,1000);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno= "";
        String religions = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)educational.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen =null;
        if(syes.isSelected()){
            seniorcitizen="yes";}
            else if(sno.isSelected())
                    {
                    seniorcitizen="no";
                    }
        
        String existingaccount=null;
        if(ayes.isSelected())
        {
            existingaccount="yes";
            
        }
        else if(ano.isSelected()){
            existingaccount="no";
        }
                String span=pan.getText();
        String saadhar=aadhar.getText();
        

        try{
           
                Conn c =new Conn();
                String query ="insert into signuptwo values('"+formno+"','"+religions+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+saadhar+"','"+existingaccount+"','"+span+"')";
           c.st.executeUpdate(query); 
            
        setVisible(false);
        new SignupThree(formno).setVisible(true);
        }
         catch (Exception e)
        {
            System.out.println(e);
        }
    }
        
        
    
    public static void main(String [] args){
       new SignupTwo("");
    }
    
}
