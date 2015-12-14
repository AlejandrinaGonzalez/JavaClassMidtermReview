public class BirdProgram {

    public static void analyze(Bird bird) {
	// This method does something with a Bird class.
	System.out.println(bird.color);
    }

    public static void main(String[] args) {

	// Start here.
	Bird bird = new Bird();
	bird.call();
    }
}

class Bird {
    public String color = "red";

    public void call() {
	// Pass this class instance to another method.
	BirdProgram.analyze(this);
    }
}
/*
 OUTPUT:
 red 
 */
