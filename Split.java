public class Split {
	
	public static void main (String[] args) {
		String name = "John Smith";
		String[] names = name.split(" ");
		String first = names[0];
		String last  = names[1];
		System.out.println(last + " " + first);
	}
}

