import java.util.Scanner;
import java.io.*;
public class RPGPlayer
{
	//parameters
	String name;
	private int hp;
	private int strength;
	private double speed;
	private String weapon;
	
	//default constructor
	public RPGPlayer()
	{
		name = "noob";
		hp = 100;
		strength = 0;
		speed = 0;
		weapon = "Fists";
	}
	
	//parameterized constructor
	public RPGPlayer(String aName, int health, int power, double aSpeed, String aWeapon)
	{
		setName(aName);
		setHP(health);
		setStrength(power);
		setSpeed(aSpeed);
		setWeapon(aWeapon);
	}
	
	//third constructor
	public RPGPlayer(String fileName)
	{
		readFromFile(fileName);
	}

	
	//writes the new file
	public void writePlayerFile(String fileName)
	{
		PrintWriter fileWrite;
		try
		{
			fileWrite = new PrintWriter(new FileOutputStream(fileName));
			fileWrite.println("Name " + name);
			fileWrite.println("HP " + hp);
			fileWrite.println("Strength " + strength);
			fileWrite.println("Speed " + speed);
			fileWrite.println("Weapon " + weapon);
			fileWrite.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}	
	
	//splits the file and makes it readable
	public void readFromFile(String fileName)
	{

		Scanner fileScanner = null;
		try
		{
			fileScanner = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		while(fileScanner.hasNext())
		{
			String fileLine = fileScanner.nextLine();
			String[] splitLines = fileLine.split(" ",2);
			//checks each word and makes sure it is ok
			if(splitLines[0].equalsIgnoreCase("Name"))
			{
				name = splitLines[1];
			}
			
			if(splitLines[0].equalsIgnoreCase("Speed"))
			{
				speed = Double.parseDouble(splitLines[1]);
			}
			
			if(splitLines[0].equalsIgnoreCase("Strength"))
			{
				strength = Integer.parseInt(splitLines[1]);
			}
			
			if(splitLines[0].equalsIgnoreCase("HP"))
			{
				hp = Integer.parseInt(splitLines[1]);
			}
			
			if(splitLines[0].equalsIgnoreCase("Weapon"))
			{
					weapon = splitLines[1];
			}
			
		}
		fileScanner.close();
	
	}

	//accessors and mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return hp;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength)
	{
		if(strength < 0) //checks for valid value
		{
			System.out.println("Error! Invalid Strength");
		}
		else
		{	
			this.strength = strength;
		}	
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double aSpeed) {
		if(aSpeed < 0) //checks for valid speed
		{
			System.out.println("Error! Invalid Speed");
		}
		else
		{	
			this.speed = aSpeed;
		}	
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	//print info method
	public void printInfo()
	{
		System.out.println("Name: " + name + "\nHP: " + hp + "\nStrength: " + strength +
							"\nSpeed: " + speed + "\nWeapon: " + weapon);
	}
		

}
