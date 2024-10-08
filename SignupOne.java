
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser; 
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
         random = Math.abs((ran.nextLong() %9000L) + 1000L);
        
        JLabel formo = new JLabel("APPLICATION FORM NO");
        formo.setFont(new Font("Raleway",Font.BOLD,38));
        formo.setBounds(140,20,600,40);
        add(formo);
        
        JLabel personaldetails = new JLabel("page 1: Personal Details");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        personaldetails.setBounds(290,80,400,30);
        add(personaldetails);
        
         JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(nameTextField);
        
        JLabel fname = new JLabel("Fathers's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);
        
         datechooser = new JDateChooser();
        datechooser.setBounds(300,240,200,30);
        add(datechooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        female = new JRadioButton("female");
        female.setBounds(450, 290, 120, 30);
             female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
         JLabel Email = new JLabel("Email:");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,340,200,30);
        add(Email);
        
         emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         married = new JRadioButton("married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450, 390, 100, 30);
             unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
          other = new JRadioButton("other");
        other.setBounds(630, 390, 100, 30);
             other.setBackground(Color.WHITE);
        add(other);
        
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(unmarried);
        maritalgroup.add(married);
        maritalgroup.add(other);
        
        
         JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(addressTextField);
        
        
         JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
         cityTextField = new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(cityTextField);
        
        
         JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        
         stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(stateTextField);
        
        
         JLabel pincode = new JLabel("pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        pinTextField = new JTextField();
        pinTextField.setBounds(300,590,400,30);
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(pinTextField);
        
         next =new JButton("next");
        next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD, 14));
         next.setBounds(620, 660, 80, 30);
         next.addActionListener(this);
         add(next);
         
        getContentPane().setBackground(Color.GRAY);
        setSize(850,1000);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno= ""+ random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender="male";}
            else if(female.isSelected())
                    {
                    gender="female";
                    }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected())
        {
            marital="married";
            
        }
        else if(unmarried.isSelected()){
            marital="unmaaried";
        }
        else if(other.isSelected()){
            marital="other";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pinTextField.getText();
        
        try{
            if(name.equals(""))
                JOptionPane.showMessageDialog(null,"Name Field is Required");
            else{
                Conn c =new Conn();
                String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
           c.st.executeUpdate(query); 
           
           setVisible(false);
           new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
        }
        
    
    public static void main(String [] args){
       new SignupOne();
    }
    
}
