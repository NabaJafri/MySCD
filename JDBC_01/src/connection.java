import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		final String url = "jdbc:mysql://localhost/test";
//		final String url = "jdbc:mysql://localhost:3306/test";
		final String url = "jdbc:mysql://127.0.0.1:3306/test";
		final String user = "root";
		final String password = "fast123";
		Connection con = DriverManager.getConnection(url, user, password);
		if (con == null) {
			System.out.println("JDBC aoisdnasd connection is not established");
			return;
		} else {
			System.out.println("Congratulations, fgsxdfgehtJDBC connection is established successfully.\n");
		}
		con.close();
	}
}