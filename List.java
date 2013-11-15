public class List {
	private int[] myList;

	/**
	 * Creates an array myList and assigns the int 0 to every element of that
	 * array
	 */
	public void List(int numInts) {

		// Creates array myList
		myList = new int[numInts];

		// Assigns 0 to every element of myList
		for (int i = 0; i < myList.length; i++) {
			myList[i] = 0;
		}
	}

	/**
	 * Returns a string in which all of the elements of myList are stored.
	 */
	public String toString() {

		String storeString = myList[0] + ", ";

		for (int i = 1; i < myList.length; i++) {
			storeString = storeString + myList[i] + ", ";
		}

		return storeString;
	}

	/**
	 * Fills myList with random values.
	 */
	public void fillWithRandom() {
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int) (Math.random() * 100);
		}

	}
}

/*
 * Initialized list: 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
 * Randomized list: 93, 84, 32, 93, 14, 36, 42, 30, 14, 30, 
 * Initialized list: 0, 0, 0, 0, 0, 
 * Randomized list: 19, 50, 36, 66, 62,
 */