package Models;

public class OnlineCustomer<Online> extends Customer{

    public OnlineCustomer(double tCaP, double tCrP) {
        super(tCaP, tCrP);
    }
    public String username;
    public boolean Online;
    double furtherDiscount = 0.05;
    double totalCost;
    double cost;

    public OnlineCustomer() {

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



    public OnlineCustomer(double cost) {
        this.cost = cost;
    }

    public enum customerCategory{
        INDIVIDUAL(1),
        BUSINESS(0.02),
        GOVERNMENT(0.03);

        customerCategory(double v) {
        }

    }
    public void OnlineCustomer(String  usrnm, boolean Ol,double cst) {//constructor with parameters
        String username = usrnm;
        boolean Online = Ol;
        double cost = cst;
    }

    public void setUsername(String usrnm)
    {
        username = usrnm;
    }

    public void setOnline(boolean Ol)
    {
        Online = Ol;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean getOnline()
    {
        return Online;
    }

    public double getTotalCost()
    {
       if (!getOnline()){
           if(username == String.valueOf(customerCategory.BUSINESS)){
               totalCost= cost - cost*0.02-cost*0.05;
           }
           if(username == String.valueOf(customerCategory.GOVERNMENT)){
               totalCost= cost - cost*0.05-cost*0.05;
           }
           if(username == String.valueOf(customerCategory.BUSINESS)){
               totalCost= cost - cost-cost*0.05;
           }
           return totalCost;

       } else
        return totalCost;
    }
}