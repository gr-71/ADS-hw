package hw.lesson5;

public class Thing {

    private final String title;
    private final int weight;
    private final int price;

    public Thing (String title, int weight, int price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
