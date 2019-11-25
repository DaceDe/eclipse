package com.accenture.lecture16;

public class Warrior {

	private String name;
	private int health;

	public Warrior(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	private boolean isAlive() {
		boolean isAlive;
		if (health > 0) {
			isAlive = true;
		} else {
			isAlive = false;
		}
		return isAlive;
	}

	public void recievedDamage(int damage) {
		if (health > 0) {
			health = health - damage;
		} else {
			System.out.println("Your warrior is dead!");
		}

	}

	public void restoreHealth(int plusHealthAmount) {

		if (isAlive()) {
			if (health > 100) {
				System.out.println("Warrior health is full!");
			} else
				health = health + plusHealthAmount;
		} else {
			System.out.println("Your warrior is dead!");
		}

	}

	public String toString() {
		return "Warrior name is " + getName() + " and has health level "
				+ getHealth();
	}

}
