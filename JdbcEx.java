package naveen;
import java.sql.*;
public class JdbcEx
{
	public static void main(String ar[])
	{
		try{

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/Product";
		String username = "root";
		String password = "postgres";
		//step-1: Register the driver
		Class.forName(driver);
		
		//step-2: Get the connection
		Connection con = DriverManager.getConnection(url,username,password);
		
		//step-3: create the statement object 
		Statement stmt = con.createStatement();
		
		//step-4: execute the queries
		stmt.executeUpdate("insert into student values(1,'santosh')");
		stmt.executeUpdate("insert into student values(2,'hari')");
	
		//step-5: close the driver
		con.close();
		}
catch(Exception e)
{
System.out.println(e);
}
	}
}

