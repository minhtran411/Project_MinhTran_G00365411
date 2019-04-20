import java.util.Random;
public class Cards {

 public static void main(String[] args) {
 Cards method = new Cards();
 String[] value  = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
 String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
 int suitNum = 0;
 int valueNum = 0;
 String[] deck = new String[52];

		for (int i = 0; i < deck.length; i++) {

			if ((i == 12) || (i == 25) || (i == 38)){
				deck[i] = value[valueNum]+" of "+suit[suitNum];
				valueNum = 0;
				suitNum++;
			}else {
				deck[i] = value[valueNum]+" of "+suit[suitNum];
				valueNum++;
		    }

		}

		method.shuffle(deck);

       for (int c = 0; c < deck.length; c++) {
	 		System.out.println(deck[c]);
       }

}

 public String[] shuffle(String[] deck) {
 Random rnd = new Random();
	  for (int i = deck.length - 1; i >= 0; i--) {
		  int index = rnd.nextInt(i+1);
		  String a = deck[index];
		  deck[index] = deck[i];
		  deck[i] = a;
	  }
	return deck;

 }






}