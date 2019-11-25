package com.accenture.lecture16;

public class WarriorApp {


	public static void main(String[] args) {
		Warrior warrior1 = new Warrior("Peter", 50);
		
		warrior1.getHealth();
		System.out.println(warrior1);
		
		
		warrior1.restoreHealth(80);

		System.out.println(warrior1.getHealth());		
		warrior1.restoreHealth(80);

		System.out.println(warrior1.getHealth());
		
		
		
	}

}
