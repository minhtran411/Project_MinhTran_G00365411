import java.util.Scanner;
public class BigNumber {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	int num;

 	System.out.print("Enter a number: ");
 	num = input.nextInt();

 	if (num > 1000000) {
		System.out.println("That is a big number.");
	}
 }
}