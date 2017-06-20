
public class Contractor extends Person{
	private String company;
	private String contact;
	
	public Contractor(String firstName, String lastName, String dateOfBirth, String email, String Mobile, boolean isAttending,
			String company, String contact)
	{
		super(firstName, lastName, dateOfBirth, email, Mobile, isAttending);
		this.company = company;
		this.contact = contact;
	}
	
	public String getTextDetails()
	{
		return(super.getTextDetails()) + "," + null + ","+ null + "," + this.company + "," + this.contact + "\n";
	} 
	public String getSQLDetails()
	{
		return (super.getSQLDetails()) + "'null'," + 
				"'null'," + 
				"'" + this.company + "'," + 
				"'"+ this.contact + "'" +
				");"
				;
		}
	

}

