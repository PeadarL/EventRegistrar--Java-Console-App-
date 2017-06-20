
public abstract class Person  // Determine Protection level later.
{
	protected String firstName;
	protected String lastName;
	protected String dateOfbirth;
	protected String email;
	protected String mobile;
	protected boolean isAttending;
	
	public Person() // default Constructor
	{		
		
	}	
	public Person(String firstName, String lastName, String dateOfBirth, String email, String mobile, boolean isAttending)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfbirth = dateOfBirth;
		this.email = email;
		this.mobile = mobile;
		this.isAttending = isAttending;
	}
	
	public String getTextDetails()
	{
		return  this.firstName + "," + this.lastName + 
				"," + this.dateOfbirth + "," + this.email + "," + this.mobile 
				+ "," + this.isAttending;
	} 
	public String getSQLDetails()
	{
		return  
				"VALUES ("+ 				// properties formatted as an SQL statement.
				"'" + this.firstName + "',"+
				"'" + this.lastName + "'," + 
				"'" + this.dateOfbirth + "'," + 
				"'" + this.email + "'," + 
				"'" + this.mobile + "'," + 
				"'" + this.isAttending + "'," // the SQL statement is left open and closed in each subclasses method.
				; 

	} 
	

}
