public class Item {
    private String name;
    private double price;
    private int calories;

    public Item(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}