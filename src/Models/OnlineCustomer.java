import java.util.Enumeration;

public class OnlineCustomer<Online> extends Customer{

    public OnlineCustomer(double tCaP, double tCrP) {
        super(tCaP, tCrP);
    }
    public String username;
    public boolean Online;
    double furtherDiscount = 0.05;
    public enum customerCategory{
        INDIVIDUAL(1),
        BUSINESS(0.02),
        GOVERNMENT(0.03);

        customerCategory(double v) {
        }

    }
    public OnlineCustomer(String usrnm, boolean Ol) {//constructor with parameters
        String username = usrnm;
        boolean Online = Ol;
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
}