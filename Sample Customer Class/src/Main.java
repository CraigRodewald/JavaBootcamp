import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String newCustomerName;
		String newCustomerCreditCard;
		
		
		System.out.print("Enter the customer's name: ");
		newCustomerName = scan.nextLine();
		
		System.out.print("Enter the credit card number: ");
		newCustomerCreditCard = scan.nextLine();
		
		Customer newCustomer = new Customer();
		newCustomer.setName(newCustomerName);
		newCustomer.setCreditCard(newCustomerCreditCard);
		
		
		System.out.println("\nThe new customer's name is " + newCustomer.getName());
		System.out.println("Their credit card number is " + newCustomer.getCreditCard());
		
		scan.close();
		scan.close();
	}

}
