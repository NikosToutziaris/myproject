package Models;

public class Customer {

    String name;
    double totalCashPurchases;
    double totalCreditPurchases;
    public int totalNumberOfTransactions;

    public Customer(double tCaP, double tCrP) //constructor with parameters
    {
        totalCashPurchases= tCaP;
        totalCreditPurchases = tCrP;
    }

    public Customer() {

    }

    public void buyInCash(){

    }

    public void buyByCreditCard(){

    }
    public void settotalCashPurchases(double tCaP)
    {
        totalCashPurchases=tCaP;
    }

    public void settotalCreditPurchases(double tCrP)
    {
        totalCreditPurchases=tCrP;
    }

    public double gettotalCashPurchases()
    {
        return totalCashPurchases;
    }

    public double gettotalCreditPurchases()
    {
        return totalCreditPurchases;
    }

    public int getTotalNumberOfTransactions(){
        return (int) (gettotalCashPurchases()+gettotalCreditPurchases());
    }


}
