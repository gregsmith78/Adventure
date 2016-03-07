import java.util.*;
import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			Scanner girl = new Scanner(System.in);
			
			System.out.println("It's Saturday Night!");
			System.out.println("You're a little thirsty and you decide to go out for a drink.");
			System.out.println("You get to the bar and the bartender asks if you want a (1)Beer or (2)Cocktail?");
			
			int choice; 
			choice = input.nextInt();
			
		
			switch(choice){
			case 1:
				System.out.println("I'll have an IPA please!");
				break;
			case 2:
				System.out.println("I'll have a Jack n Coke please!");
				break;
			default:
				System.out.println("Make way for paying customers Chump!");
				
			}
		

		Lady mya = new Lady("Mya", "brunette", "green eyes", "pink dress", 5.5, 1-345-6000);
		//System.out.println("You're sitting at the bar and a beautiful woman sits next to you and says  + " " + mya.myaDialogue());
		//mya.myaDialogue();
		mya.isFun();
		
		//Beer bottle = new Beer();
		//bottle.setKind("IPA");
		//System.out.println(bottle.getKind());
		//bottle.Open();
	

	}

}
