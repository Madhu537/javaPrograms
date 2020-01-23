/*package interviewPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException {

			//Step 1 connection establishment
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
			
			//Step 2 Statement creation
			Statement stmt = con.createStatement();
			
			//step 3 execute sql statement
			String s = "Insert into TableName values(102,'test','abc')";
			//step 4 colse the connection();
			
			ResultSet rs = stmt.execute(s);
			while(rs.next())
			{
				String uname = rs.getString("uname");
				String pwd = rs.getString("pwd");
				
			}
			//step 5
			con.close();
			
			System.out.println("Program executed successfully");
			
			
			

	}

}
*/