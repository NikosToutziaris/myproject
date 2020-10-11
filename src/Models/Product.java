package Models;

public class Product extends  OnlineCustomer{

    int id;
    String name;
    double priceWhenBuy;
    double PriceWhenShell;

    public Product(double tCaP, double tCrP, int id, String name, double priceWhenBuy, double priceWhenShell) {
        super(tCaP, tCrP);
        this.id = id;
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        PriceWhenShell = priceWhenShell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public void setPriceWhenBuy(double priceWhenBuy) {
        this.priceWhenBuy = priceWhenBuy;
    }

    public double getPriceWhenShell() {
        return PriceWhenShell;
    }

    public void setPriceWhenShell(double priceWhenShell) {
        PriceWhenShell = priceWhenShell;
    }

}