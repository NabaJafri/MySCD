import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {
// SQL query
private static final String INSERT_PERSON_QUERY = "INSERT INTO PERSON VALUES(?,?,?)";
private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
private static final String USERNAME = "root";
private static final String PASSWORD = "fast123";

public static void main(String[] args) {
// declare variables
Scanner scan = null;
int noRec = 0, sid = 0;
String name = null, address = null;
Connection con = null;
PreparedStatement ps = null;
int result = 0;

try {
// read input
scan = new Scanner(System.in);
if(scan != null) {
System.out.print("Enter the number of records that you want to insert: ");
noRec = scan.nextInt();
}

// establish the connection
con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

// compile SQL query and
// store it in PreparedStatemet object
if(con != null)
ps = con.prepareStatement(INSERT_PERSON_QUERY);

// read multiple set of inputs from end-user
// set input values and execute the query
if(scan != null && ps != null) {
	for(int i=0; i < noRec; i++) {

		// read inputs
		System.out.println("\nEnter Record-"+ (i+1) +" details, ");
		System.out.print("ID: ");
		sid = scan.nextInt();
		System.out.print("Name: ");
		name = scan.next();
		System.out.print("Address: ");
		address = scan.next();

		// set input values to query parameters
		ps.setInt(1, sid);
		ps.setString(2, name);
		ps.setString(3, address);

		// execute the query
		result = ps.executeUpdate();
		}
		}

		// process the result
		if(result == 0)
		System.out.println("\nRecords not inserted");
		else
		System.out.println("\nRecords inserted"+" successfully");

		} catch(SQLException se) {
		se.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
			} // end of try-catch block
			}

			}
