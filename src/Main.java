public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        AxeOfShadows axeOfShadows = new AxeOfShadows();
        ShieldOfFire shieldOfFire = new ShieldOfFire();
        BootsOfSwiftness bootsOfSwiftness = new BootsOfSwiftness();
        OrcishHelmet orcishHelmet = new OrcishHelmet();
        ElixirOfWrath elixirOfWrath = new ElixirOfWrath();

        Target goblin = new Target("Troll", 100);

        inventory.addItem(axeOfShadows);
        inventory.addItem(bootsOfSwiftness);
        inventory.addItem(shieldOfFire);
        inventory.addItem(orcishHelmet);
        inventory.addItem(elixirOfWrath);
        System.out.println();

        bootsOfSwiftness.equip();
        bootsOfSwiftness.equip();
        bootsOfSwiftness.unequip();
        bootsOfSwiftness.unequip();
        inventory.removeItem(bootsOfSwiftness);
        System.out.println();

        axeOfShadows.equip();

        inventory.showInventory();
        System.out.println();

        axeOfShadows.shadowStrike(goblin);

        shieldOfFire.fireball(goblin);

        elixirOfWrath.use();
    }
}
