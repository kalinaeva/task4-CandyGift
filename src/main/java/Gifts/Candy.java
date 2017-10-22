package Gifts;

/**
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */
public class Candy {
    private String brand;
    private Double weight;
    private Double price;
    private Double kkal;

    public Candy(String brand, Double weight, Double price, Double kkal) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        this.kkal = kkal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getKkal() {
        return kkal;
    }

    public void setKkal(Double kkal) {
        this.kkal = kkal;
    }
}
