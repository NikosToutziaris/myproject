package Models;

import Interfaces.Store;

public class SimpleRetailStore implements Store {

    double totalBuyBalance;
    double totalSellBalance;

    public double getTotalBuyBalance() {
        return totalBuyBalance;
    }

    public void setTotalBuyBalance(double totalBuyBalance) {
        this.totalBuyBalance = totalBuyBalance;
    }

    public double getTotalSellBalance() {
        return totalSellBalance;
    }

    public void setTotalSellBalance(double totalSellBalance) {
        this.totalSellBalance = totalSellBalance;
    }

    public SimpleRetailStore(double totalBuyBalance, double totalSellBalance) {
        this.totalBuyBalance = totalBuyBalance;
        this.totalSellBalance = totalSellBalance;
    }

    @Override
    public void buy(){

    }

    @Override
    public void shell(){

    }

    @Override
    public double getRevenue(){

       return 0;
   }

}
