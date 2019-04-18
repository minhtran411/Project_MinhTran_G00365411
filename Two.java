import java.util.Scanner;
public class Two {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);

 	System.out.print("Enter the first number: ");
 	int num1 = input.nextInt();
 	System.out.print("Enter the second number: ");
 	int num2 = input.nextInt();

 	if ((num1 == 2) && (num2 == 2)) {
		System.out.println("Both numbers entered are two.");
	} else if ((num1 == 2) || (num2 == 2)) {
		if (num1 == 2) {
			System.out.println("First number entered is two.");
	    } else {
			System.out.println("Second number entered is two.");
		}
	} else {
		System.out.println("Neither numbers entered is two.");
	}

 }
}