public class Armor extends Item implements Equippable {
    private int defense;
    private boolean isEquipped;

    public Armor(String name, int weight, int value, int defense) {
        super(name, weight, value);
        this.defense = defense;
        this.isEquipped = false;
    }

    public void equip() {
        if (isEquipped) {
            System.out.println(getName() + " is already equipped.");
        } else {
            isEquipped = true;
            System.out.println("You have equipped the armor: " + getName());
        }
    }

    public void unequip() {
        if (!isEquipped) {
            System.out.println(getName() + " is not equipped.");
        } else {
            isEquipped = false;
            System.out.println("You have unequipped the armor: " + getName());
        }
    }

    public void polish() {
        System.out.println(getName() + " has been polished and is now extra shiny!");
    }

    public String toString() {
        return super.toString() + ", Defense: " + defense + (isEquipped ? ", is equipped" : ", is not equipped");
    }
}