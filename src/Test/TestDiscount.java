package Test;

import Models.OnlineCustomer;

public class TestDiscount extends OnlineCustomer {


    private static final double tCaP = 0;
    private static final double tCrP = 1;

    public TestDiscount() {
        super(tCaP, tCrP);
    }


    public static void main(String[] args) {

        OnlineCustomer OlC = new OnlineCustomer();
        OlC.getOnline();
        OlC.getCost();
        OlC.getTotalCost();
        System.out.println(OlC.getTotalCost());

        }

    }
