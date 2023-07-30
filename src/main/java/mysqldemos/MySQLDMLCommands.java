package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*1) Create a connection
        2)Create statement/Query
        3) Execute statement/Query
        4) close connection*/
public class MySQLDMLCommands {
    public static void main(String[] args) throws SQLException {

        // 1) Create a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","24Septembers$");

        // 2)Create statement/Query & Execute statement/Query
        Statement stmt=con.createStatement();

        //String s ="INSERT INTO STUDENT VALUES(103,'SMITH')";
        //String s = "UPDATE STUDENT SET SNAME='DAVID' WHERE SID=103";
        String s = "DELETE FROM STUDENT WHERE SID=103";

        //3) Execute statement/Query
        stmt.execute(s);

        //4) close connection
        con.close();

        System.out.println("Query executed.....");
    }
}
