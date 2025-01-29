package studio2;

import java.util.Scanner; 

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int startAmount, winLimit;
		double winChance; 
		int totalSimulations;
		
		
		System.out.println("How many total simulations do you want to run? ");
		totalSimulations = in.nextInt();
		
		for (int i = 1 ; i <= totalSimulations ; i++ ) {	
			System.out.println("How much money is in your pocket mama?"); 
			
			startAmount = in.nextInt();  
			System.out.println("At how much money are you going to cash out DIVA?"); 
			winLimit = in.nextInt(); 
			
			System.out.println("What the chance you will win each round? (0 to 1)"); 
			winChance = in.nextDouble();
			
		
			
			//if (>0) while (>0) random if win if lose
			
			while (startAmount>0 && startAmount < 100) {
			startAmount = startAmount - 10; 
			double score =	Math.random(); 
			if (score >= winChance) {
				startAmount = startAmount + 20; 
				System.out.println("You win!"); 
				System.out.println("Current amount: " + startAmount); 
			}
			else {
				System.out.println("LOSERRRRR!"); 
				System.out.println("Current amount: " + startAmount);
			}
			if (startAmount == winLimit) { 
				System.out.println("You're a Winner! Succesful Day!"); 
			}
			if (startAmount == 0) {
				System.out.println("You're a LOSER BABY!");
			}
			System.out.println("Day " + i + " Complete! ");
			}
		}
	}
}
