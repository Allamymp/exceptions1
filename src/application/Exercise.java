package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Exercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
		System.out.println("Enter account data:");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		 sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial Balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.println("Withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();  
		System.out.println();  
		System.out.println();  
		System.out.println("Enter amount for Withdraw:");
		Double amount = sc.nextDouble();
		account.withdraw(amount);
		}
		catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
