
public class ExpressionsInSwitch {
	
    public static void main(String[] args) {

	int value = 100;

	// match constant-value expressions in cases
	switch (value) {
	case 10 * 1:
	    System.out.println("A");
	    break;
	case 10 * 10:
	    System.out.println("B");
	    break;
	case 10 * 100:
	    System.out.println("C");
	    break;
	}
    }
}
/*
 OUTPUT:
 B
 */