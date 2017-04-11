public class InstanceInitializer {

	public static void main(String[] args) {
		{ System.out.println("Feathers"); }
	}

	{ System.out.println("Snowy"); }
}

//Field and instance initialier blocks run in the order which they appear in file
//Constructor runs after all fields and instance initializers have run.