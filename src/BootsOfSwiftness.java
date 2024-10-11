public class BootsOfSwiftness extends Armor {
    private int speedBoost;

    public BootsOfSwiftness() {
        super("Boots of Swiftness", 3, 300, 15);
        this.speedBoost = 20;
    }

    public void increaseSpeed() {
        System.out.println("You equipped the " + getName() + " and your speed is increased by " + speedBoost + " points!");
    }

    public String toString() {
        return super.toString() + ", Special Ability: Increases Speed by " + speedBoost;
    }
}