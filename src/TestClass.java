import java.util.ArrayList;

public class TestClass 
{
	public ArrayList<Person> populateList(){
		ArrayList<Person> personList = new ArrayList<Person>();
		
		GeneralEmployee Franz = new GeneralEmployee("Franz", "Kafka","July 3rd 1883","Gregor@Verwandelt.de","089 9999999", true, 20,"BleiStiftSpitzner");
		Contractor Jules = new Contractor("Jules", "Verne", "February 8th 1828", "Jules@Passepartout.fr", "083 20000", true, "BiblioTheque nationale de France","Par Courrier");
		Guest HP = new Guest("H.P.", "Lovecraft", "August 20th 1890", "Shadow@Innsmouth.com", "090000000", false, "Unkown","?");
		personList.add(Franz);
		personList.add(Jules);
		personList.add(HP);
		
		return personList;		
	}
	
	public void testTextFileDatabase(ArrayList<Person> personList)
	{
	IDataBase db = new TextFileSystem();
	
	db.create();
	db.writeData(personList);	
	}	
	public void testSQLDatabase(ArrayList<Person> personList)
	{

	IDataBase db = new SQliteDataBase();

	db.create();
	db.writeData(personList);	
	}
}
