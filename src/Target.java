public class Target {
    private String name;
    private int health;

    public Target(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Remaining health: " + health + ".");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}