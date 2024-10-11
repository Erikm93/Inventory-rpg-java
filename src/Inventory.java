import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " not found in inventory.");
        }
    }

    public void showInventory() {
        if (items.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Inventory contents:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}