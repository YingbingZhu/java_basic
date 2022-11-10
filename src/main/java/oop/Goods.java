package oop;

public class Goods {
    private String id;
    private String name;
    private double prices;
    private int count;

    public Goods(String id, String name, double prices, int count) {
        this.id = id;
        this.name = name;
        this.prices = prices;
        this.count = count;
    }

    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
