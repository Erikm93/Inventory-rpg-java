public class Consumable extends Item implements Usable {
    private int duration;

    public Consumable(String name, int weight, int value, int duration) {
        super(name, weight, value);
        this.duration = duration;
    }

    public void use() {
        System.out.println("You have used " + getName() + " and its duration is " + duration + " minutes.");
    }

    public String toString() {
        return super.toString() + ", Duration: " + duration + " minutes";
    }
}