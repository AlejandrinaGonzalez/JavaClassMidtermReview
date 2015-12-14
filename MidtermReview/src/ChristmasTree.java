import static java.lang.System.*; 
import java.util.*;
public class ChristmasTree { 
	private static Scanner scan;
	public static void main(String[] args) {
        scan = new Scanner(in);
        out.print("Please enter a number: ");
        int temp = scan.nextInt();
        int x = (temp-1)*2 +1; 
        int y = x/2;  // calculate how many spaces needed to print before the stump
        int z = 1;  // initial #of * needed to print
        for(int i=0; i<temp; i++) { //determines how many lines to print 
            for(int j=0; j<=y; j++) out.print(" "); //determines how many spaces to print
            for(int k = 0; k<z; k++) out.print("*"); // determines how many * to print 
            out.println(); 
            y--;
            z+=2; //add 2 for the 1,3,5,7 increment
        }
        for(int i =0; i<=x/2; i++) out.print(" "); //prints the spaces you need until you reach the middle
        out.println("*"); // the stump!
    }
}
