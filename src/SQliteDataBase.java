import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQliteDataBase implements IDataBase 
{
	Connection c = null;
	Statement stmt = null;

	public void create()

	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:EventDatabase.sqlite"); // need to check if the database is here, if there isn't one it will create one
			System.out.println("Connected to Data Base OK!!");
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		try 
		{
			stmt = c.createStatement();
		}
		catch (SQLException e1) 
		{

			e1.printStackTrace();
		} 
		String createTable = "CREATE TABLE if not exists Attendance " +  // Whether the table exists or not is caught in the SQL statement
		"( id INTEGER PRIMARY KEY AUTOINCREMENT," + 
		"firstname CHAR(80) DEFAULT NULL," +
		"lastname CHAR(80) DEFAULT NULL," +
		"dateOfBirth CHAR(80) DEFAULT NULL," +
		"email CHAR(80) DEFAULT NULL," + 
		"mobile CHAR(80) DEFAULT NULL," +
		"isAttending BOOL DEFAULT NULL," +
		"jobTitle CHAR(80) DEFAULT NULL," +
		"salary INT DEFAULT NULL," +
		"company CHAR(80) DEFAULT NULL," +
		"contact CHAR(80) DEFAULT NULL" +
		")";
		try {
			stmt.executeUpdate(createTable);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void writeData(ArrayList<Person> people)
	{
		for (int i = 0; i < people.size(); i ++)
		{
		Person temp = people.get(i);	
		String insertPerson = "INSERT INTO Attendance (firstname, lastname, dateOfBirth, email, mobile, isAttending, jobTitle, salary, company, contact) " 
		+ temp.getSQLDetails();
		try {
			stmt.executeUpdate(insertPerson);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Printed to SQlite!!");
		}			
		
	}
}

