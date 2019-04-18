import java.util.Scanner;
public class Index {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);


 	System.out.println("Menu:\n1. Lisa\n2. Big Number\n3. Number\n4. Two\n5. Name Age\n6. For Loop\n7. Months\n 8. Cards ");
 	System.out.print("Which program do you want to run: ");
 	int choice = input.nextInt();

    while ((choice>=1) && (choice <=8)) {

		switch(choice) {
			case 1 :
			  Lisa.main(new String[0]);
			break;
			case 2 :
					  BigNumber.main(new String[0]);
			break;
			case 3 :
					  Number.main(new String[0]);
			break;
			case 4 :
					  Two.main(new String[0]);
			break;
			case 5 :
					  NameAge.main(new String[0]);
			break;
			case 6 :
					  ForLoop.main(new String[0]);
			break;
			case 7 :
					  Months.main(new String[0]);
			break;
			case 8 :
					  Cards.main(new String[0]);
			break;
			default:
				System.out.println("Please enter a valid choice. < From 1 to 8 >");
			break;
		}

		System.out.println("Menu:\n1. Lisa\n2. Big Number\n3. Number\n4. Two\n5. Name Age\n6. For Loop\n7. Months\n 8. Cards ");
		System.out.print("Which program do you want to run <Ctrl+Z to quit.>: ");
 	    choice = input.nextInt();

    }

 }
}