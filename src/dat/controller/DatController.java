package dat.controller;

import java.util.Scanner;

public class DatController
{
	private String myName;
	private Scanner readKeyboardInput;
	public DatController()
	{
		myName = "Jackson Carter";
		readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("suh dude");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said " + userInput);

		
		System.out.println("How old are you?");
		Integer ageInput = readKeyboardInput.nextInt();
		System.out.println("you are " + ageInput + " years old");
		readKeyboardInput.nextLine();

		System.out.println("how much does a Wendy's Dave's Double cost?");
		Double priceInput = readKeyboardInput.nextDouble();
		
		if (priceInput == 5.19) 
			{
				System.out.println("you are correct");
			}
		else
			{
				System.out.println("No, a Wendy's Dave's Double costs $5.19");
			}
		readKeyboardInput.nextLine();

		System.out.println("What is your mother's maiden name?");
		String motherInput = readKeyboardInput.next();
		System.out.println("Your mother's maiden name is " + motherInput);
		readKeyboardInput.nextLine(); // clears remainder of the text.
	
		
		System.out.println("Who is your favorite president?");
		String presidentInput = readKeyboardInput.nextLine();
		System.out.println("Your favorite president is " + presidentInput);
	
		
		System.out.println("Have you ever owned any pets?");
		String firstpetInput = readKeyboardInput.next();
		if (firstpetInput.equalsIgnoreCase("Y") || firstpetInput.equalsIgnoreCase("Yes"))
				{					
					System.out.println("what was your first pet's name?");
					String petInput = readKeyboardInput.next();
					System.out.println("Your pet's name is " +petInput);					
				}
		readKeyboardInput.nextLine();	
	
		
		System.out.println("Did you brush your teeth today? (Y/N");
		String teethInput = readKeyboardInput.next();
		if (teethInput.equalsIgnoreCase ("Y") || teethInput.equalsIgnoreCase("Yes"))
			{
				System.out.println("I'm Glad");
			}
		else
			{
				System.out.println("That's nasty");
			}
		readKeyboardInput.nextLine();
		
		System.out.println("What is your favorite restaurant?");
		String foodInput = readKeyboardInput.next();
		System.out.println("Your favorite restaurant is " + foodInput);
		
		System.out.println("Do you have any stolen property on you?");
		String stolenInput = readKeyboardInput.next();
		if (stolenInput.equalsIgnoreCase("Y") || stolenInput.equalsIgnoreCase("Yes"))
			{
				System.out.println("Stop! You've violated the law. Pay the court a fine or serve your sentence.");
				System.out.println("Your stolen goods are now forfeit");
			}
		readKeyboardInput.nextLine();
	}
}
