package com.abstraction;

import java.util.Scanner;

abstract class GameCharacter{

	String  name , level , healthPoints;
	abstract void  attack();
	abstract void chooseTarget();
	abstract void animateAttack();
	public GameCharacter(String name, String level, String healthPoints) {
		super();
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
	}
	


}

class Warrior extends GameCharacter{
	String weaponType;

	public Warrior(String name, String level, String healthPoints, String weaponType) {
		super(name, level, healthPoints);
		this.weaponType = weaponType;
	}

	@Override
	void attack() {
System.out.println( "Performing melee attack with Sword.");		
	}

	@Override
	void chooseTarget() {
System.out.println("Target selected.");		
	}

	@Override
	void animateAttack() {
System.out.println("Attack animation played.");		
	}
	
	
	
	
}

class Mage extends GameCharacter{
	String spellType;

	public Mage(String name, String level, String healthPoints, String spellType) {
		super(name, level, healthPoints);
		this.spellType = spellType;
	}

	@Override
	void attack() {
System.out.println( "Casting spell: Fireball.");		
	}

	@Override
	void chooseTarget() {
System.out.println( "Target selected.");		
	}

	@Override
	void animateAttack() {
System.out.println( "Attack animation played.");		
	}
	
	
	
}

class Archer extends GameCharacter{
	String arrowType;

	public Archer(String name, String level, String healthPoints, String arrowType) {
		super(name, level, healthPoints);
		this.arrowType = arrowType;
	}

	@Override
	void attack() {
System.out.println( "Shooting arrow: Elven Arrow.");		
	}

	@Override
	void chooseTarget() {
System.out.println( "Target selected.");		
	}

	@Override
	void animateAttack() {
System.out.println( "Attack animation played.");		
	}
	
	
	
	
}


public class Example6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Select Your choice : \n1.Warrior\n2.Mege\n3.Archer");
int key= sc.nextInt();



switch (key) {
case 1: {
	GameCharacter warrior = new  Warrior("Conan", "5", "100", "Sword");
	warrior.attack();
	warrior.chooseTarget();
	warrior.animateAttack();
	
	break;
}
case 2: {
	
	GameCharacter mega = new Mage("Gandalf", "7", "120", "Fireball");
	mega.attack();
	mega.chooseTarget();
	mega.animateAttack();
	
	break;
}
case 3: {
	
	GameCharacter archar = new  Archer("Legolas", "8", "110", "Elven Arrow");
	archar.attack();
	archar.chooseTarget();
	archar.animateAttack();
	break;
}
default:
System.out.println("Invalid Input");
}
sc.close();
	}

}
