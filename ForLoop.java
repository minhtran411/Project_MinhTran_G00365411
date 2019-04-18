import java.util.Scanner;
public class ForLoop {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	int num;
 	int sum=0;

 	for (int i = 1; i <= 10; i++) {
		System.out.print("Enter number "+i+": ");
		num = input.nextInt();
			if ((num%2)!=0) {
				sum += num;
			}
	}

	System.out.println("Sum of all odd numbers is: "+sum);

 }
}