/*Class:	CSE 1321L
Section: 	W01          
Term:		Fall 2019  
Instructor:	Rehnuma Afrin
Name:		Sarita Jordan    
Assignment#:		2
*/

import java.util.Scanner;
public class FerrariCurrency {
	public static void main(String[] args) {
	{
		double amountUSD = 50;
		double amountFrancs = amountUSD * 9240.00F;
		System.out.print("Enter an amount in USD: ");
		Scanner sc = new Scanner (System.in);
		amountUSD = sc.nextDouble();
		System.out.println("You have " + amountFrancs + " Guinean Francs.");
		}	
}
}