import java.util.Scanner;

class User{

	String name;
	int age;
	boolean man;
	int size;
	
	void sayHi(){
		System.out.println("Hi, my name is " + name + " I'm " + age + " old");
	}
	
}

public class app {

	
	public static void main(String[] args) {
	
		String name = "John";
		int age = 29;
		boolean man = false;
		int size = 42;
		
		String name1 = "Alisia";
		int age2 = 32;
		boolean man2 = true;
		int size2 = 38;
		
		
		User peter = new User();
		peter.name = "John";
		peter.age = 29;
		peter.man = true;	
		peter.sayHi();
		
		
		User alisia = new User();
		alisia.name = "Alisia";
		alisia.age = 32;
		alisia.man = false;
		alisia.sayHi();
		
	}

	}


