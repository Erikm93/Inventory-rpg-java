public class OrcishHelmet extends Armor {
    private int strength;

    public OrcishHelmet() {
        super("Orcish Helmet", 10, 85, 25);
        this.strength = 10;
    }

    public String toString() {
        return super.toString() + ", Orcish fighting spirit adds " + strength + " strength";
    }
}

