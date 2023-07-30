package mysqldemos;

import java.sql.*;

/*1) Create a connection
        2)Create statement/Query
        3) Execute statement/Query
        4) Store data in resultset
        5) close connection*/
public class MySQLSelectCommands {
    public static void main(String[] args) throws SQLException {

        // 1) Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://MySQL_Database:3306/mydb","root","24Septembers$");

        // 2)Create statement/Query & Execute statement/Query
        Statement stmt=con.createStatement();
        String s = "select employee_id,first_nae,last_name fro employees";

        //3) Execute statement/Query 4)Store data in resultset
        ResultSet rs = stmt.executeQuery(s);
        while(rs.next())
        {
            int eid =  rs.getInt("EMPLOYEE_ID");
            String fname = rs.getString("FIRST_NAME");
            String lname = rs.getString("LAST_NAME");

            System.out.println(eid+" "+fname+ " "+lname);
        }

        //5) close connection
        con.close();

        System.out.println("Query executed.....");
    }
}
