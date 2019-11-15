
public class rr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Peter";
		int age = 21;
		boolean man = false;		
		String name1 = "Anna";
		int age2 = 22;
		boolean man2 = true;		
		User peter = new User();
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;	
		System.out.println("Hi, my name is " + peter.name + " I'm " + peter.age + " old");		User anna = new User();
		
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		System.out.println("Hi, my name is " + anna.name + " I'm " + anna.age + " old");					}}
	}

}
