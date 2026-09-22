import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkoutTest {

    @Test
    public void TestingAddItem(){
        checkout checkout = new checkout();

        checkout.addItem("fish",3,3400);
        checkout.addItem("rice",7,1800);
        checkout.addItem("turkey",5,2000);

        assertEquals(3, checkout.getQuantity().size());
        assertEquals(3, checkout.getPrice().size());
        assertEquals("rice", checkout.getItemNames().get(1));

    }

    @Test
    public void TestThatGetSubTotalGivesCorrectResult(){
        checkout checkout = new checkout();

        checkout.addItem("fish",3,3400);
        checkout.addItem("rice",7,1800);
        checkout.addItem("turkey",5,2000);

        assertEquals(32800,checkout.getSubT0tal());

    }

    @Test
    public void TestThatVatIsCorrect(){
        checkout checkout = new checkout();


        checkout.addItem("fish",3,3400);
        checkout.addItem("rice",7,1800);
        checkout.addItem("turkey",5,2000);

        checkout.setDiscount(424);

        assertEquals(2428.2,checkout.getVat());

    }

    @Test
    public void TestThatWeCanGetTotalWithVat(){
        checkout checkout = new checkout();

        checkout.addItem("fish",3,3400);
        checkout.addItem("rice",7,1800);
        checkout.addItem("turkey",5,2000);

        checkout.setDiscount(424);

        assertEquals(34804.2,checkout.getTotal());
    }

    @Test
    public void TestThatCustomerGetsChangeIfAmountPaidGreaterThanPriceOfWhatHeBought(){
        checkout checkout = new checkout();

        checkout.addItem("fish",3,3400);
        checkout.addItem("rice",7,1800);
        checkout.addItem("turkey",5,2000);

        checkout.setDiscount(424);
        checkout.setAmountPaid(40000);
        assertEquals(5195.8,checkout.getBalance(),0.001);


    }
}
