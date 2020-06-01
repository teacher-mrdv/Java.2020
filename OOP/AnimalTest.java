public class AnimalTest
{
	
	// for testing purposes
	public static void main (String[] args)
	{	// declaration   instantiation
		Animal monkey  = new Animal();		// monkey = object <-- does all work
		monkey.species = "Ape";
		monkey.gender = 'M';
		monkey.dob = "2/4/2002";
		monkey.name = "Bobo";
		System.out.println(monkey.species);
		System.out.println(monkey.gender);
		System.out.println(monkey.dob);
		System.out.println(monkey.name);
		//System.out.println(Animal.name); // Animal is a class, a bluprint and does not have a name; only an object will contain data
		monkey.print();
		Animal.hi();
		
		Animal fish = new Animal("Fish", 'F', "5/8/2019", "Nemo");
		//System.out.println(fish);
		
		System.out.println(monkey.name);
		System.out.println(fish.name);
		
		Animal snail = new Animal("Snail", 'M', "5/8/2019", "Turbo");
		System.out.println(monkey.name);
		System.out.println(fish.name);
		System.out.println(snail.name);
		System.out.println(monkey.name);

		System.out.println(Animal.counter);

		
	}
}

