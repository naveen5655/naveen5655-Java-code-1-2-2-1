package naveen;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;
public class JdbcStatementExample {
public static void main(String[] args) {
try {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/Product";
	String username = "root";
	String password = "postgres";
	//step-1: Register the driver
	Class.forName(driver);
	Connection con = DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
String query="create table RAM(Sno int,Product_specification_and_name varchar(100),"+"Date_of_product_manufacturing date,MRP_on_the_product int,Invoice_bill_no bigint,"+"Product_manufacturer varchar(100))";
boolean flag=st.execute(query);
if(!flag)
	System.out.println("Table created succesfully");
else
	System.out.println("Not created");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

