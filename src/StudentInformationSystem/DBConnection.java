
package StudentInformationSystem;

import java.sql.*;

public class DBConnection {
    
    public static Statement statementObject(){
        try {
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println(" Driver loaded");
        } catch (Exception e) {
            System.out.println("Driver not loaded"+e);
        }
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgmt","root","");
          
            System.out.println("Db connected");
        } catch (Exception e) {
            System.out.println("Db not connected");
        }
   
        Statement st=null;
        try {
            st=con.createStatement();
            
        } catch (Exception e) {
            System.out.println("query not executed");
        }
        
    return st;
    }
    
}
