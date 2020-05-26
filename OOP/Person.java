public class Person	// class name
{
	// attributes
	int id;
	String name;
	String dateOfBirth;
	char gender;

	// methods
	public Person()	// empty constructor
	{		}
	
	// constructor = creates an object and initliases the object (and its data, with values)
	public Person(int i, String n, String dob, char g)	// overloading constructor
	{
		id = i;
		name = n;
		dateOfBirth = dob;
		gender = g;
	}
	
	public static void main(String[] args)
	{
		// instantiate (create) a class --> marcos (object)
		Person marcos = new Person();
		marcos.id = 123456;
		marcos.name = "Marcos Rodrigo";
		marcos.dateOfBirth = "1/1/1000";
		marcos.gender = 'M';
		System.out.println( marcos.id );
		System.out.println( marcos.name );
		System.out.println( marcos.dateOfBirth );
		System.out.println( marcos.gender );
		
	}
}

