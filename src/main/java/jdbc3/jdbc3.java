package jdbc3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class jdbc3 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String name;
		
		String rollno;
		Scanner sc = new Scanner(System.in);
System.out.println("Enter student name ");
name = sc.nextLine();

System.out.println("Enter student rollno ");
rollno=sc.nextLine();
sc.close();
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","username","password");
	Statement stmt=con.createStatement();
	String query="INSERT INTO table1 values('"+rollno+"','"+ name+"')";
	stmt.executeUpdate(query);
	System.out.println("record saved");
}
catch(Exception e)
{
	System.out.println("error"+e.toString());
}
	}

}
