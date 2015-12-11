/*
 * Alejandrina Gonzalez
 * pd. 2
 * 12/7/15
 */

import java.util.*;

public class CheckYourMath {
	
	// Properties/variables
	private static Scanner _scanner;
    private static int _inputA; // radius
    private static int _inputB;
    private static int _inputC;

    
	public static void main(String[] args) {
		
		System.out.println("Enter a number for A:");
		// init scanner for user's input
		_scanner = new Scanner(System.in);
		// create local variable and assign it the user's input 
		_inputA = _scanner.nextInt();
		// print _input variable and calculates AREA
		System.out.println("The area of the circle with radius A is:" + getArea());
		
		System.out.println("Enter a number for B:");
		// init scanner for user's input
		_scanner = new Scanner(System.in);
		// create local variable and assign it the user's input 
		_inputB = _scanner.nextInt();
		
		System.out.println("Enter a number for C:");
		// init scanner for user's input
		_scanner = new Scanner(System.in);
		// create local variable and assign it the user's input 
		_inputC = _scanner.nextInt();
		
		// QUADRATIC FORMULA
		//calculates positive number of quadratic formula 
		double quadraticFormulaPos = (-_inputB + Math.sqrt(Math.pow(_inputB,2)-(4*_inputA*_inputC)))/(2*_inputA);
		//calculates negative number of quadratic formula 
		double quadraticFormulaNeg = (-_inputB - Math.sqrt(Math.pow(_inputB,2)-(4*_inputA*_inputC)))/(2*_inputA);
		
		System.out.println("The values for the quadratoc formula are:");
		//checks if the answers are "NaN" = not a number
		if (Double.isNaN(quadraticFormulaPos) || Double.isNaN(quadraticFormulaNeg))
	        {
	            System.out.println("Not real numbers/answers!"); // if they are not real answers
	        } else { // if they are real answers 
	        	System.out.println("Positive value:" + quadraticFormulaPos + "\n" + "Negative value:" + quadraticFormulaNeg);
	        }
		//Print pythagorean theorem
		System.out.println("With A and B the value for C is: " + pythTheom(_inputA, _inputB));
	}
	
	// PYTHAGOREAN THEOREM 
    public static double pythTheom(int a, int b){
        double result = Math.sqrt((a*a)+(b*b));
        return result;
    }
	
	// Constructors
	 public CheckYourMath() { _inputA = 0; } //_inputA is the radius
	  	
	 public CheckYourMath(int r) { _inputA = r; } //_inputA is the radius
	    
	  // Accessors
	  public int getRadius() { return _inputA; }
	    
	  public void setRadius(int r) { _inputA = r; }
	    
	  public static double getArea() {
	      return cricleArea();
	  }
	  private static double cricleArea() {
	      return _inputA * _inputA * Math.PI;
	  }

}
