package naveen;
import java.sql.*;
public class PostgreSQLCon{
public static void main(String args[]){
try{ Class.forName("com.PostgreSQL.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:PostgreSQL://localhost:3306/sonoo","root","postgres");
//here sonoo is database name, root is username and password 
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); con.close();
}catch(Exception e){ System.out.println(e);}
}
}
