package com.accenture.lecture16;

public class WarriorApp {


	public static void main(String[] args) {
		Warrior warrior1 = new Warrior("Peter",20, 90);
		Warrior warrior2 = new Warrior("Bob",50, 60);
		
		warrior1.fight(warrior2);
		warrior1.getHealth();
		System.out.println(warrior1);
		
		
		warrior1.restoreHealth(-90);

		System.out.println(warrior1.getHealth());		
		warrior1.restoreHealth(80);

		System.out.println(warrior1.getHealth());
		
//		warrior1.fight(warrior2);
		while(warrior1.isAlive() && warrior2.isAlive()){
			warrior1.fight(warrior2);
			break;
		}
		
		
		
		
	}

}
