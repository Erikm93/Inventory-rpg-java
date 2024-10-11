public class AxeOfShadows extends Weapon {
    private int shadowStrikeDamage;

    public AxeOfShadows() {
        super("Axe of Shadows", 13, 220,40);
        this.shadowStrikeDamage = 55;
    }

    public void shadowStrike(Target target) {
        System.out.println("You performed a Shadow Strike with the " + getName() + "!");
        System.out.println("A large shadow strikes the target, dealing " + shadowStrikeDamage + " damage.");
        target.takeDamage(shadowStrikeDamage);
    }

    public String toString() {
        return super.toString() + ", Special Ability: Shadow Strike " + shadowStrikeDamage + " damage";
    }
}