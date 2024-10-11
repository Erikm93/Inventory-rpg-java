public class Weapon extends Item implements Equippable {
    private int damage;
    private boolean isEquipped;

    public Weapon(String name, int weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;
        this.isEquipped = false;
    }

    public void equip() {
        if (isEquipped) {
            System.out.println(getName() + " is already equipped.");
        } else {
            isEquipped = true;
            System.out.println("You have equipped the weapon: " + getName());
        }
    }

    public void unequip() {
        if (!isEquipped) {
            System.out.println(getName() + " is not equipped.");
        } else {
            isEquipped = false;
            System.out.println("You have unequipped the weapon: " + getName());
        }
    }

    public void attack(Target target) {
        if (!isEquipped) {
            System.out.println(getName() + " is not equipped, you cannot attack.");
            return;
        }

        System.out.println("Attacking " + target.getName() + " with " + getName() + " for " + damage + " damage.");
        target.takeDamage(damage);
    }

    public String toString() {
        return super.toString() + ", Damage: " + damage + " health" + (isEquipped ? ", is equipped" : ", is not equipped");
    }
}
