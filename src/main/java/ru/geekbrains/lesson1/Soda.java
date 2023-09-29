package ru.geekbrains.lesson1;

public class Soda extends Product{
    private String sugar;

    public Soda(String brand, String name, double price, String sugar){
        super(brand, name, price);
        this.sugar = sugar;
    }

    public String GetSugar() {
        return sugar;
    }

    public void setSugar(String sugar){
        this.sugar = sugar;
    }

    @Override
    public String displayInfo() {
        return String.format("[Газировка] %s - %s - %.2f - вид: %s", brand, name, price, sugar);
            }
}
