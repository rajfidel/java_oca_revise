public class Egg {
	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}

	private int number = 3;
	{number = 4;}
}


//O/P: 5
//long max = 31213213213; //DOES NOT COMPILE
//long max = 31213213213L; //COMPILES
//Identifiers can start with letters , $ or _, subsequent characters may be numbers
//Normal Java conventions: 
//1. Methods and variable names start with a lowercase followed by Camelcase
//2. Class names begin with uppercase followed by camelcase.
//Default initialization: 
//1. local variables have to be initialized before use
//2. instance and class variables will be initialized before use.
//	boolean to false, char to '\u0000', byte, short, int, long to 0, flaot, double to 0.0, object refs to null
//Scope of variables:
//1. local variables: from declaration to end of block
//2. Instance variables: from declaration to obj garbage collected
//3. Class variables: from declaration to program end
//Ordering elements in file: PIC (Package, Import, Class)
//System.gc not guaranteed to run.
//finalize() can be implemented by objects. This method is called when GC tries to garbage collect the object.
//finnalize() if not run successfully the first time, Does not run a second time.
