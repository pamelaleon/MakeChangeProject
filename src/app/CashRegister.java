package app;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the price of the item you wish to purchase today!");
		double amount = sc.nextDouble();

		System.out.println("Please enter amount tendered!");
		double tendered = sc.nextDouble();

		if (tendered < amount) {
			System.out.println("Insufficient amount... please provide appropriate amount for item");
		}

		if (amount == tendered) {
			System.out.println("Thankyou for providing the exact amount!");
		}

		if (tendered > amount) {
			System.out.println(changeOwed(amount, tendered));
			
		}

		sc.close();
	}

	public static String changeOwed(double amount, double tendered) {
       double total = tendered - amount; 
       int pennies, nickles, dimes, quarters, dollars, fiveDollars, tenDollars, twentyDollars, fiftyDollars, hundredDollars;
       String response = "";
       
       hundredDollars = (int)((total / 100) + 0.05);
       total = total % 100;
       fiftyDollars = (int)((total / 50) + 0.05);
       total = total % 50;
       twentyDollars = (int)((total / 20) + 0.05);
       total = total % 20;
       tenDollars = (int)((total / 10) + 0.05);
       total = total % 10;
       fiveDollars = (int)((total / 5) + 0.05);
       total = total % 5;
       dollars = (int)((total / 1) + 0.05);
       total = total % 1;
       quarters = (int)((total / 0.25) + 0.05);
       total = total % 0.25;
       dimes = (int)((total / 0.10) + 0.05);
       total = total % 0.10;
       nickles = (int)((total / 0.05) + 0.05);
       total = total % 0.05;
       pennies = (int)((total / 0.01) + 0.05);
       total = total % 0.01;
       
       if (hundredDollars >= 2) {
    	   response = response + (" " + hundredDollars + " hundred dollar bills " + ":");
       }
       else if (hundredDollars == 1) {
    	   response = response + (" " + hundredDollars + " hundred dollar bill" + ":");
       }
       if(fiftyDollars >= 2) {
    	   response = response + (" " + fiftyDollars + " fifty dollar bills " + ":");
       }
       else if (fiftyDollars == 1) {
    	   response = response + (" " + fiftyDollars + " fifty dollar bill" + ":");
       }
       if(twentyDollars >= 2) {
    	   response = response + (" " + twentyDollars + " twenty dollar bills " + ":");
       }
       else if (twentyDollars == 1) {
    	   response = response + (" " + twentyDollars + " twenty dollar bill" + ":");
       }
       if(tenDollars >= 2) {
    	   response = response + (" " + tenDollars + " ten dollar bills " + ":");
       }
       else if (tenDollars == 1) {
    	   response = response + (" " + tenDollars + " ten dollar bill" + ":");
       }
       if(fiveDollars >= 2) {
    	   response = response + (" " + fiveDollars + " five dollar bills " + ":");
       }
       else if (fiveDollars == 1) {
    	   response = response + (" " + fiveDollars + " five dollar bill" + ":");
       }
       if(dollars >= 2) {
    	   response = response + (" " + dollars + " dollar bills " + ":");
       }
       else if (dollars == 1) {
    	   response = response + (" " + dollars + " dollar bill" + ":");
       }
       if(quarters >= 2) {
    	   response = response + (" " + quarters + " quarters " + ":");
       }
       else if (quarters == 1) {
    	   response = response + (" " + quarters + " quarter" + ":");
       }
       if(dimes >= 2) {
    	   response = response + (" " + dimes + " dimes " + ":");
       }
       else if (dimes == 1) {
    	   response = response + (" " + dimes + " dime" + ":");
       }
       if(nickles >= 2) {
    	   response = response + (" " + nickles + " nickles " + ":");
       }
       else if (nickles == 1) {
    	   response = response + (" " + nickles + " nickle" + ":");
       }
       if(pennies >= 2) {
        	   response = response + (" " + pennies + " pennies " + ":");
       }
       else if (pennies == 1) {
    	   response = response + (" " + pennies + " penny" + ":");
       }
       
		return ("You are owed: " + response);
		
	}

}
