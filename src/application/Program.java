package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Invoice;
import entities.services.BrazilTaxService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Register a product: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Invoice invoice = new Invoice(name, price, quantity, new BrazilTaxService());

		System.out.println("Here is your invoice: ");
		System.out.println(invoice);
	}

}
