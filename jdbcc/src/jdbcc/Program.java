package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Program {
	public static void main(String[] args) throws Exception {
// see note at bottom
		Class.forName("com.mysql.cj.jdbc.Driver");
// variables for connection
		final String url = "jdbc:mysql://127.0.0.1:3306/test";

		final String user = "root";
		final String password = "fast123";
// establish the connection
		Connection con = DriverManager.getConnection(url, user, password);
// display status message
		if (con == null) {
			System.out.println("JDBC connection is not established");
			return;
		} else {
			System.out.println("Congratulations, JDBC connection is established successfully.\n");
		}
//Remember to close the JDBC connection
		con.close();
	}
}
