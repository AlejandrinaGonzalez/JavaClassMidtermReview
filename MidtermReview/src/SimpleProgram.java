
//program that uses derived class ("extends")
class A {
    public void call() {
	System.out.println("A.call");
    }
}

class B extends A {
    public void call() {
	System.out.println("B.call");
    }
}

public class SimpleProgram {
    public static void main(String[] args) {

	// Reference new B class by A type.
	A a = new B();
	// Invoke B.call from A class instance.
	a.call();
    }
}
/*
 OUTPUT:
 B.call
 */