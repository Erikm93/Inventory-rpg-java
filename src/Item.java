public abstract class Item {
    private String name;
    private int weight;
    private int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ": Weight: " + weight + " kg, Value: " + value + " gold";
    }
}