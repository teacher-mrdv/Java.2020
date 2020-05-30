// Zoo

public class Animal // BLUEPRINT - recipe, generic, concept or definition of an animal
{
	// data to capture about 'the animal' = ATTRIBUTES / FIELDS / PROPERTIES / INSTANCE VARIABLES (object)
	String species;
	char gender;
	String dob;
	String name;
	
	static int counter; // static means only 1 copy of the variable which belongs to the class; CLASS VARIABLE
	
	
	// methods = actions, behaviours, methods
	public Animal()	// empty constructor (default if none written, must be written if a custom one is present)
	{	counter++;
	}
	
	public Animal(String s, char g, String d, String n)	// custom constructor
	{
		species = s;
		gender = g;
		dob = d;
		name = n;
		counter++;
	}
	
	public static void hi()
	{
		System.out.println("HI");
	}
	
	public String print()
	{	return name;
	}
	
	public void die()
	{
		counter--;
	}

}

