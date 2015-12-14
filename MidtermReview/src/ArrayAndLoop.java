public class ArrayAndLoop {
	
    public static void main(String[] args) {
    	
	int[] anArray;	        //declare array of integers

	anArray = new int[10];	// create/init array of integers

	// assign a value to each array element 
	for (int i = 0; i < anArray.length; i++) {
		anArray[i] = i;
	    }

	// print a value from each array element
	for (int i = 0; i < anArray.length; i++) {
	    System.out.print(anArray[i] + " ");
	}
	System.out.println();
    }
    
}
/*
 OUTPUT:
 0 1 2 3 4 5 6 7 8 9 
 */