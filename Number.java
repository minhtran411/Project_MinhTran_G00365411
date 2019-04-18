import java.util.Scanner;
public class Number {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	int num;

 	System.out.print("Enter a number: ");
 	num = input.nextInt();

 	if (num > 0) {
		System.out.println("Number entered is positive.");
	}else if (num < 0) {
		System.out.println("Number entered is negative.");
	}else {
		System.out.println("Number entered is zero.");
	}

 }
}