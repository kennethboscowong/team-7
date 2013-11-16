import java.util.Scanner;

public class TestConatactList
{
	public static void main(String[] args) {

	Contact contact;
    contact = new Contact();
    ContactList list = new ContactList();
	Scanner in = new Scanner(System.in);

	int choice = 0;
	while(choice != 3){

    	System.out.println("Welcome to the Contact manager!");

   		System.out.println("What would you like to do (please choose a number)?");

    	System.out.println("1) Add a contact");

    	System.out.println("2) Search for a contact");

    	System.out.println("3) Print all contacts");

		choice = in.nextInt();

	if(choice == 1)
	{
		list.addContact();
	}
	else if(choice == 2)
	{
		list.searchContact();
	}
	else if(choice == 3)
	{
		list.printContact();
	}

	}
	}
}

