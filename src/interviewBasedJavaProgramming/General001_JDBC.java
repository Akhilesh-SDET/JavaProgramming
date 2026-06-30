package interviewBasedJavaProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class General001_JDBC {
	static Connection conn;

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection("URL", "UN", "PWD");
		Statement statement = conn.createStatement();
		String query = "query";
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getString(1));
			
		}
	}
}
