public class Months {
 public static void main(String[] args) {
 	String[] monthAr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
 	String output = "";

 	for (int i = 0; i < monthAr.length; i++) {
		if (monthAr[i].contains("r")) {
			output += monthAr[i]+"\n";
		}
	}

 	System.out.println(output);
 }
}