
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedSelect {
// SQL query
private static final String SELECT_PERSON_QUERY ="SELECT NAME, ADDRESS FROM PERSON"+" WHERE ID = ?";
private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
private static final String USERNAME = "root";
private static final String PASSWORD = "fast123";

public static void main(String[] args) {
// declare variables
Scanner scan = null;
int id = 0;
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
boolean flag = false;
try {
	
	// read input
	scan = new Scanner(System.in);
	if(scan != null) {
	System.out.print("Enter person ID: ");
	id = scan.nextInt();
	}

	// establish the connection
	con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	// compile SQL query and
	// store it in PreparedStatemet object
	if(con != null)
	ps = con.prepareStatement(SELECT_PERSON_QUERY);

	// set input value to query parameter
	if(ps != null)
	ps.setInt(1, id);
	// execute the query
	if(ps != null)
	rs = ps.executeQuery();
	// process the result
	if(rs != null) {
	while(rs.next()) {
	flag = true;
	System.out.println(""
	+ rs.getString("NAME") +" "
	+ rs.getString("ADDRESS"));
	}
	}
	if(flag)
		System.out.println("Records fetched & displayed");
		else
		System.out.println("Records not found");
		} catch(SQLException se) {
		se.printStackTrace();
		} catch(Exception e) {
		e.printStackTrace();
		} // end of try-catch block
		finally {
		// close JDBC objects
		try {
		if(ps != null) ps.close();
		} catch(SQLException se) {
		se.printStackTrace();
		}
		try {
		if(con != null) con.close();
		} catch(SQLException se) {
		se.printStackTrace();
		}
		try {
		if(scan != null) scan.close();
		} catch(Exception e) {
		e.printStackTrace();
		}
		} //end if finally block
		}
		}