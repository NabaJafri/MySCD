import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ManipulateData {

	public static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "fast123";

	
	public static void main(String[] args) throws SQLException {
		int choice=0;
		System.out.println("1.Insert \n 2.Display distinct location \n3.Order By Location");
		Scanner scan1 = new Scanner(System.in);
		choice = scan1.nextInt();
		switch(choice)
		{
		case 1:
			Scanner scan2 = null;
			int sno = 0;
			String sname = null, sadd = null;
			float avg = 0.0f;
			String query = null;
			Connection con = null;
			Statement st = null;
			int count = 0;
			try {
				// create Scanner class object
				scan2 = new Scanner(System.in);

				// read input
				if(scan2 != null) {
				System.out.print("Enter student number: ");
				sno = scan2.nextInt();
				System.out.print("Enter student name: ");
				sname = scan2.next();
				System.out.print("Enter student address: ");
				sadd = scan2.next();
				}
				// prepare SQL query
				query = "INSERT INTO PERSON VALUES ("+ sno + ", " + "\'" + sname +"\' ,"+"\'"+ sadd + "\') ";

				// establish the connection
				con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

				// create JDBC statement object
				if(con != null) {
				st = con.createStatement();
				}
				// execute the SQL query
				if(st != null) {
				count = st.executeUpdate(query);
				}
				// display result
				System.out.println(count + " record inserted.");

				} catch(SQLException se) {
				se.printStackTrace();
				} catch(Exception e) {
				e.printStackTrace();
				} // try-catch block end
				finally {
//					close JDBC objects
					try {
					if(st != null) st.close();
					} catch(SQLException se) {
					se.printStackTrace();
					}
					try {
					if(con != null) con.close();
					} catch(SQLException se) {
					se.printStackTrace();
					}
					try {
					if(scan2 != null) scan2.close();
					} catch(Exception e) {
					e.printStackTrace();
					}
					}//finally block end
			break;
		case 2:
			
				final String URL = "jdbc:mysql://127.0.0.1:3306/test";
				final String USERNAME = "root";
				final String PASSWORD = "fast123";

				// establish the connection
				Connection con2 = DriverManager.getConnection(URL, USERNAME,	PASSWORD);
				// create JDBC statement object
				Statement st2 = con2.createStatement();
				// prepare SQL query
				String query2 = "SELECT DISTINCT(shipment_location) FROM product";
				// send and execute SQL query in Database software
				ResultSet rs = st2.executeQuery(query2);
				// process the ResultSet object
				boolean flag = false;
				while (rs.next()) {
				flag = true;
				System.out.println(rs.getString(1));
				}
				if (flag == true) {
				System.out.println("\nRecords retrieved and displayed");
				} else {
				System.out.println("Record not found");
				}
				// close JDBC objects
				rs.close();
				st2.close();
				con2.close();
			
			break;
					}
	  
					}

	
	}

