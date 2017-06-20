
public class GeneralEmployee extends Person{
	private int salary;
	private String jobTitle;
	
	public GeneralEmployee(String firstName, String lastName, String dateOfBirth, String email, String Mobile, boolean isAttending,
			int salary, String jobTitle)
	{
		super(firstName, lastName, dateOfBirth, email, Mobile, isAttending); // passes to the parent constructor Person to prevent repetition
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public String getTextDetails()
	{
		return(super.getTextDetails()) + "," + this.jobTitle + "," + this.salary + "\n";

	} 
	public String getSQLDetails()
	{
		return (super.getSQLDetails()) + "'" + this.jobTitle + "'," + 
				"'" + this.salary + "'," + 
				"'null'," + 
				"'null'" +
				");"
				;
		}	
}


