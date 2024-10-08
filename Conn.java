
package bank.management.system;
import java.sql.*;

public class Conn {
    Connection con;
    Statement st;
    public Conn(){
        try{
         
          con =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","abhishek");
          st=con.createStatement();
        }
        catch(SQLException e){
        System.out.println(e);    
        }
            
    }
}
