import java.util.ArrayList;
import java.time.LocalDateTime;

public class checkout {
    private String customerName;
    private String cashierName;
    private double amountPaid;
    private double discount;
    private ArrayList<String>itemNames;
    private ArrayList<Integer>quantities;
    private ArrayList<Double>price;


    public checkout(String customerName,String cashierName,double amountPaid,double discount){
        this.customerName = customerName;
        this.cashierName = cashierName;
        this.amountPaid = amountPaid;
        this.discount = discount;
        itemNames = new ArrayList<>();
        quantities = new ArrayList<>();
        price = new ArrayList<>();
    }

    public checkout(){

        itemNames = new ArrayList<>();
        quantities = new ArrayList<>();
        price = new ArrayList<>();
    }

    public void addItem(String name,int quantity,double price){
        itemNames.add(name);
        quantities.add(quantity);
      this.price.add(price);
    }
    public ArrayList<String> getItemNames(){
        return itemNames;
    }

    public ArrayList<Integer> getQuantity(){
        return quantities;
    }

    public ArrayList<Double> getPrice(){
        return price;
    }

    public double getSubT0tal(){

        double sumOfTotal = 0;

        for(int count = 0 ; count < itemNames.size() ; count++){

           double total = quantities.get(count) * price.get(count);

            sumOfTotal += total;
        }

            return sumOfTotal;

    }

    public double getVat(){
        return (getSubT0tal() - getDiscount()) * 0.075;
    }

    public double getDiscount() {
     return  discount;
    }

    public void setDiscount(int  discount){
        this.discount = discount;
    }

    public double getTotal(){
        return (getSubT0tal() - getDiscount() ) + getVat();
    }

    public double getBalance(){
        return getAmountPaid() - getTotal();
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid){
        this.amountPaid = amountPaid;
    }

    public void bill(){
        LocalDateTime date = LocalDateTime.now();

        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("Location: 312,HERBERT MACAULAY WAY,SABO YABA,LAGOS.");
        System.out.println("TEL: 07051308290");
        System.out.println("DATE: "+ date);
        System.out.println("cashierName: "+ cashierName);
        System.out.println("customer Name: "+ customerName);
        System.out.println("==============================================================================================================");
        System.out.printf("%-10s%-10s%-10s%-10s%n","item","qty","price","total(NGN)");
        System.out.println("==============================================================================================================");
        for(int count = 0; count < itemNames.size() ; count++){

    String name = itemNames.get(count);
    int qty = quantities.get(count);
    double prices = price.get(count);
    double total = qty * prices;
            System.out.printf("%-10s%-10s%-10s%-10s%n", name,qty,prices,total);
}


        System.out.println("==============================================================================================================");

        System.out.println("sub total"+getSubT0tal());
        System.out.println("Discount"+ discount);
        System.out.println("vat @ 7.5 %"+ getVat());
        System.out.println("==============================================================================================================");
        System.out.println("Bill total"+ getTotal());
        System.out.println("==============================================================================================================");
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY: "+getTotal());
        System.out.println("==============================================================================================================");


    }

    public void receipt(){

        LocalDateTime date = LocalDateTime.now();

        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("Location: 312,HERBERT MACAULAY WAY,SABO YABA,LAGOS.");
        System.out.println("TEL: 07051308290");
        System.out.println("DATE: "+ date);
        System.out.println("cashierName: "+ cashierName);
        System.out.println("customer Name: "+ customerName);
        System.out.println("==============================================================================================================");
        System.out.printf("%-10s%-10s%-10s%-10s%n","item","qty","price","total(NGN)");
        System.out.println("==============================================================================================================");
        for(int count = 0; count < itemNames.size() ; count++){

            String name = itemNames.get(count);
            int qty = quantities.get(count);
            double prices = price.get(count);
            double total = qty * prices;
            System.out.printf("%-10s%-10s%-10s%-10s%n", name,qty,prices,total);
        }


        System.out.println("==============================================================================================================");

        System.out.println("sub total"+getSubT0tal());
        System.out.println("Discount"+ discount);
        System.out.println("vat @ 7.5 %"+ getVat());
        System.out.println("==============================================================================================================");
        System.out.println("Bill total"+ getTotal());
        System.out.println("Amount paid"+ amountPaid);
        System.out.println("Balance"+ getBalance());
        System.out.println("==============================================================================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==============================================================================================================");

    }
}
