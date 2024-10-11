public class ShieldOfFire extends Armor {
    private int fireballDamage;

    public ShieldOfFire() {
        super("Shield of Fire", 7, 300, 50);
        this.fireballDamage = 40;
    }

    public void fireball(Target target) {
        System.out.println("You cast Fire ball using the " + getName() + "!");
        System.out.println("A burst of fire strikes the target, dealing " + fireballDamage + " damage.");
        target.takeDamage(fireballDamage);
    }

    public String toString() {
        return super.toString() + ", Special Ability: Fireball with " + fireballDamage + " damage";
    }
}