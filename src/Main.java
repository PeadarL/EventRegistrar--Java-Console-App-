public class Main 
{

	public static void main(String[] args) 
	{
		TestClass DBTest = new TestClass();
		DBTest.testTextFileDatabase(DBTest.populateList());
		DBTest.testSQLDatabase(DBTest.populateList());
	}
}
