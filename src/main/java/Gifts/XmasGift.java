package Gifts;

import Gifts.Candy;

public class XmasGift {
    private Candy[] candies;
    private double weight;
    private double price;

    public XmasGift(Candy[] candies) {
        this.candies = candies;
        this.weight = countWeight();
        this.price = countPrice();
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public Candy[] getCandies() {
        return candies;
    }

    public void setCandies(Candy[] candies) {
        this.candies = candies;
    }

    public void printCandiesNames() {
        for (Candy candy : candies) {
            System.out.println(candy.getBrand());
        }
    }

    private double countWeight() {
        /**
         * Couny weight of gift
         */
        double weight = 0;
        for (Candy candy : candies) {
            weight = weight + candy.getWeight();
        }
        return weight;
    }

    private double countPrice() {
        /**
         * Count price of gift
         */
        double price = 0;
        for (Candy candy : candies) {
            price = price + candy.getPrice();
        }
        return price;
    }
}
