/**
 * Calls upon class list to generate a initialize and generate an array filled 
 * with random variable. Prints the initialized array and the randomized array to 
 * the console.
 */
public class testList {
	 public static void main (String args[]) {
		 List run;
	     run = new List();
	     run.List(10);
	     System.out.println("Initialized list: " + run.toString());
	     run.fillWithRandom();
	     System.out.println("Randomized list: " + run.toString());
	     
	     List run2;
	     run2 = new List();
	     run2.List(5);
	     System.out.println("Initialized list: " + run2.toString());
	     run2.fillWithRandom();
	     System.out.println("Randomized list: " + run2.toString());
	 }
}

/*
Initialized list: 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
Randomized list: 93, 84, 32, 93, 14, 36, 42, 30, 14, 30, 
Initialized list: 0, 0, 0, 0, 0, 
Randomized list: 19, 50, 36, 66, 62, 
*/