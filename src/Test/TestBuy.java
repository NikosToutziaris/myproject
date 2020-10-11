package Test;

import Models.Customer;

public class TestBuy extends Customer {

    public TestBuy(double tCaP, double tCrP) {
        super(tCaP, tCrP);
    }

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.settotalCashPurchases(400);
        c1.settotalCreditPurchases(520);
        c1.getTotalNumberOfTransactions();
        System.out.println(c1.getTotalNumberOfTransactions());

    }
}