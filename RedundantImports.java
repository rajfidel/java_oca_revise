import java.lang.System; 	//Redundant
import java.lang.*;			//Redundant
import java.util.Random;
import java.util.*;			//Redundant

public class RedundantImports {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}