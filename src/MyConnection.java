import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    Connection con = null;
    public MyConnection()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","tshiamo");
            if(con != null)
            {
                System.err.println("Connected to database succesful");
            }
        } catch (Exception e) {
           System.err.println("Connected to database succesful");
        }
    }
}