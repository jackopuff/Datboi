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
		String userInput = readKeyboardInput.next();
		System.out.println("You said " + userInput);
	}
}
