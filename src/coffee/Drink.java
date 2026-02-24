package coffee;

import java.util.Scanner;

public  abstract  class Drink {
    private int id;
    protected  String name;
    protected  double price;

    public Drink (int id, String  name, double price) {
    this.id = id;
    this. name = name;
    this. price = price;
    }

    public abstract double calculatePrice();
    void displayInfo() {
        System.out.println("Ma:" +id);
        System.out.println("Ten:"+ name);
        System.out.println("Gia:"+ price);
    }
}

