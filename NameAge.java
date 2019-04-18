import java.util.Scanner;
public class NameAge {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int counter = 1;

 	System.out.print("Enter your name: ");
 	String name = input.next();
 	System.out.print("Enter your age: ");
 	int age = input.nextInt();

 	while (counter <= age) {
		System.out.println(counter+". "+name);
		counter++;
	}

 }
}