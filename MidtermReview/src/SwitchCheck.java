/*
 * Alejandrina Gonzalez
 * pd. 2
 * 12/7/15
 */

import java.util.*;

public class SwitchCheck {
	
	//init random generator 
	private static Random _random = new Random();

	public static void main(String[] args) {
		//assign a number to the random variable from the _random generator 
		int random = _random.nextInt(5) + 1;
		switch(random){
		case 1:
			System.out.println("The random number is " + random); //prints out "The random number is 1"
			break;
		case 2:
			System.out.println("The random number is " + random); //prints out "The random number is 2"
			break;
		case 3:
			System.out.println("The random number is " + random); //prints out "The random number is 3"
			break;
		case 4:
			System.out.println("The random number is " + random); //prints out "The random number is 4"
			break;
		case 5:
			System.out.println("The random number is " + random); //prints out "The random number is 5"
			break; 
		}
	}

}
