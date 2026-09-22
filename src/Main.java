import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter customers name");
        String CustomersName = input.nextLine();

        System.out.println("enter cashiers name");
        String cashierName = input.nextLine();

        System.out.println("enter discount offered");
        double discount = input.nextDouble();

        checkout checkout = new checkout(CustomersName,cashierName,0,discount);



        String answer = "yes";


        while(answer.equalsIgnoreCase("yes")){

            System.out.println("enter item name");
            String itemsName = input.nextLine();


            input.nextLine();
            System.out.println("enter quantity of iten");
            int quantity = input.nextInt();


            input.nextLine();

            System.out.println("enter item price");
            double price = input.nextDouble();

            input.nextLine();
            checkout.addItem(itemsName,quantity,price);

            System.out.println("do you want to continue shopping");
            answer = input.nextLine();
        }
            checkout.bill();

        System.out.println("enter amount paid");
        double amountPaid = input.nextDouble();

        checkout.setAmountPaid(amountPaid);

        System.out.println("                                                                                                            ");
        System.out.println("                                                                                                            ");
        System.out.println("                                                                                                            ");
        System.out.println("                                                                                                            ");

        checkout.receipt();
    }
}