public class DivineSword extends Weapon {
    private int holyBlastDamage;

    public DivineSword () {
        super("Divine Sword", 10, 150,30);
        this.holyBlastDamage = 30;
    }

    public void holyBlast(Target target) {
        System.out.println("You performed a Shadow Strike with the " + getName() + "!");
        System.out.println("A large shadow strikes the target, dealing " + holyBlastDamage + " damage.");
        target.takeDamage(holyBlastDamage);
    }

    public String toString() {
        return super.toString() + ", Special Ability: Holy Strike " + holyBlastDamage + " damage";
    }
}