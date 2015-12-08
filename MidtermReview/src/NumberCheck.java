/*
 * Alejandrina Gonzalez
 * pd. 2
 * 12/7/15
 */

import java.util.Random;
import java.util.Scanner;

public class NumberCheck {
	
	private static Scanner _scanner; // takes user's input
	private static Random _random = new Random(); // random generator
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number:");
		
		// init scanner for user's input
		_scanner = new Scanner(System.in);
		// create local variable and assign it the user's input 
		int _input = _scanner.nextInt();
		// print _input variable
		System.out.println("Your number:" + _input);
		
		// create int variable and assign a random number between 10 and 30
		int random = _random.nextInt(20) + 10;
		// print random variable 
		System.out.println("Computer's number:" + random);
		
		// check if _input equals random
		if (_input == random){
			System.out.println("You Win.");
		} else if (_input > random) { // check if _input is greater than random
			System.out.println("Too High");
		} else if (_input < random){ // check is _input is less than random
			System.out.println("Too Low");
		} else if (_input > 30 || _input < 10) { // check if _input is greater than 30 or less than 10
			System.out.println("Out of bounds!");
		} 
		
	}

}
