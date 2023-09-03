
package edu.dandaevit.jdbc_mysql.MySQL_JDBC_project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MySQLJDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/testdb";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "LetsSQL2023#";

	private static final String QUERY = "SELECT * FROM testdb.users;";

	public static void main(String [] args) {
		Employee employeeHolder = new Employee ();
		List <Employee> listOfEmployees = new ArrayList <Employee> ();
		Set <Employee> setOfEmployees = new HashSet <> ();

		try (
		        Connection conn = DriverManager.getConnection (URL, USER_NAME, PASSWORD);
		        Statement st = conn.createStatement ();
		) {
			if ( ! conn.isClosed ()) {
				System.out.println ("The connection to the database has been established successfully");
			}
			ResultSet rs = st.executeQuery (QUERY);

			while (rs.next ()) {
				employeeHolder = new Employee ();

				employeeHolder.setUserd_id (rs.getInt (1));
				employeeHolder.setName (rs.getString (2));
				employeeHolder.setAge (rs.getInt (3));
				employeeHolder.setE_mail (rs.getString (4));

				listOfEmployees.add (employeeHolder);
			}

			setOfEmployees.addAll (listOfEmployees);

			System.out.println ("-----------------------------");
			for (Employee empl : setOfEmployees) {
				System.out.println (empl);
			}
		} catch (SQLException exception) {
			exception.printStackTrace ();
		}

	}
}
