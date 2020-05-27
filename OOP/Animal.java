// Zoo

public class Animal // generic, concept or definition of an animal
{
	String species;	// data to capture about 'the animal' = ATTRIBUTES / FIELDS
	char gender;
	String dob;
	String name;
	
	// methods
	public Animal()	// empty constructor (default if none written, must be written if a custom one is present)
	{ }
	
	public Animal(String s, char g, String d, String n)	// custom constructor
	{
		species = s;
		gender = g;
		dob = d;
		name = n;
	}
	
	public String print()
	{	return name;
	}
	
	// for testing purposes
	public static void main (String[] args)
	{	// declaration   instantiation
		Animal monkey  = new Animal();		// monkey = object
		monkey.species = "Ape";
		monkey.gender = 'M';
		monkey.dob = "2/4/2002";
		monkey.name = "Bobo";
		System.out.println(monkey.species);
		System.out.println(monkey.gender);
		System.out.println(monkey.dob);
		System.out.println(monkey.name);
		monkey.print();
		
		Animal fish = new Animal("Fish", 'F', "5/8/2019", "Nemo");
		System.out.println(fish);
	}
}

