package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfMilk getBottleofMilk(double volume, int fat) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public Soda getSoda(String shugar) {
        for (Product product : products) {
            if (product instanceof Soda) {
                Soda soda = (Soda) product;
                if (soda.GetSugar().contains(shugar)) {
                    return soda;
                }
            }
        }
    return null;
    }
}