package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section
	//All class data members are declared private
	
	private Scanner myInput;
	
	//Constructors go here
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	//Methods
	
	public void start()
	{
		questions();
	}
	
	private void questions()
	{
		System.out.println("Hello, what is your name?");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Hello "+input+", Cool name!");
		System.out.println("What about your full name?");
		String fullName = myInput.nextLine();
		System.out.println("Your full name is: "+fullName);
		System.out.println("How old are you?");
		int myAge = myInput.nextInt();
		System.out.println("Wow "+input+", you are "+myAge+" years old!");
	}
}
