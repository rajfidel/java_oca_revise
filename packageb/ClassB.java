package packageb;
import packagea.ClassA;

public class ClassB {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println("Got It!");
	}
}

//Class paths to build and run
//javac -cp ".:/tmp/someOtherLocation:/tmp/myTmp.jar" myPackage.myClass