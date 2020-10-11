package Models;

import Interfaces.Store;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements Store {

    List<Product> productsList = new ArrayList<>();

    public void getInventory(){

    }

    public void clearOutInventory(){

    }

    @Override
    public void buy() {

    }

    @Override
    public void shell() {

    }

    @Override
    public double getRevenue() {
        return 0;
    }
}
