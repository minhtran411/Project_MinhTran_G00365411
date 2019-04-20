import java.util.Scanner;
public class Index {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);


 	System.out.println("Menu:\n1. Lisa\n2. Big Number\n3. Number\n4. Two\n5. Name Age\n6. For Loop\n7. Months\n 8. Cards ");
 	System.out.print("Which program do you want to run: ");
 	int choice = input.nextInt();

//an infinite loop for the menu to pop up after finish running code; instruction is showed <Ctrl+Z> for the users to stop the code from running
    for (int i = 0; i >= 0; i++) {

		switch(choice) {
			case 1 :
			  Lisa.main(new String[0]);
			  System.out.println();
			break;
			case 2 :
					  BigNumber.main(new String[0]);
					  System.out.println();
			break;
			case 3 :
					  Number.main(new String[0]);
					  System.out.println();
			break;
			case 4 :
					  Two.main(new String[0]);
					  System.out.println();
			break;
			case 5 :
					  NameAge.main(new String[0]);
					  System.out.println();
			break;
			case 6 :
					  ForLoop.main(new String[0]);
					  System.out.println();
			break;
			case 7 :
					  Months.main(new String[0]);
					  System.out.println();
			break;
			case 8 :
					  Cards.main(new String[0]);
					  System.out.println();
			break;
			default:
				System.out.println("Please enter a valid choice. < From 1 to 8 >\n");
			break;
		}

		System.out.println("Menu:\n1. Lisa\n2. Big Number\n3. Number\n4. Two\n5. Name Age\n6. For Loop\n7. Months\n 8. Cards \n");
		System.out.print("Which program do you want to run <Ctrl+Z to quit.>: ");
 	    choice = input.nextInt();

    }

 }
}