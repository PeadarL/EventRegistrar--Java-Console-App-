import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class TextFileSystem  implements IDataBase 
{
	File file = new File("TextFileDataBase.csv");

	public void create() 
	{
			if(!file.exists()) // if doesn't exist, create a new file.
			{
				try 
				{
					file.createNewFile();
					System.out.println("Created Text File!");

				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("File Already Exists.");
			}

	}
	public void writeData(ArrayList<Person> people) // Dependency inversion
	{
		try 
		{
			PrintWriter pw = new PrintWriter(file);
			pw.append("Firstname ,Lastname, Date of Birth, Email, PhoneNumber, Attendance, Job Title, Salary, Firm, Contact \n" );
			for (int i = 0; i < people.size(); i ++)
			{
				Person temp = people.get(i);
				pw.append(temp.getTextDetails());
				System.out.println("Printed to Text File!");
			}
			pw.close(); // close file at end of loop
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}