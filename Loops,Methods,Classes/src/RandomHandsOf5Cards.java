import java.util.Random;
import java.util.Scanner;


public class RandomHandsOf5Cards {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	String[] cards= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	String[] suits= {"♣","♦","♥","♠"};
	String[] hand= new String[5];
	for (int a =0;a<n;a++){
		for ( int i =0; i<=4; i++){
			if (i==0){
		String randomCard = cards[new Random().nextInt(cards.length)];
		String randomSuit = suits[new Random().nextInt(suits.length)];
		hand[i]=randomCard+randomSuit;
			}else{
				String randomCard = cards[new Random().nextInt(cards.length)];
				String randomSuit = suits[new Random().nextInt(suits.length)];
				hand[i]=randomCard+randomSuit;
				if (hand[i-1].charAt(1)==hand[i].charAt(1)&&
						hand[i-1].charAt(0)==hand[i].charAt(0)){
					randomCard = cards[new Random().nextInt(cards.length)];
					randomSuit = suits[new Random().nextInt(suits.length)];
					hand[i]=randomCard+randomSuit;
				}
			}
		}
		for (int j=0;j<=4;j++){
		System.out.print(hand[j]);
		}
		System.out.println();
	}
	}
}
