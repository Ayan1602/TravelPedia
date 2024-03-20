package travel.management.system;

import java.sql.*;
public class conn {
    
    Connection c;
    Statement s;
    conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","123456789");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
