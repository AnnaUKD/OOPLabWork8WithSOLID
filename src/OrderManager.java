import java.util.ArrayList;
import java.util.List;

class OrderManager {
    private final List<OrderItem> items = new ArrayList<>();
    private final List<MenuItem>  menu;

    public OrderManager(List<MenuItem> menu) {
        this.menu = menu;
    }

    public void addItem(String itemName, int qty) {
        for (MenuItem m: menu){
            if (m.getName().equals(ItemName)) {
                items.add(new OrderItem(m, qty));
                System.out.println("Додано: " + itemName + " х" + qty);
                return;
            }
        }
        System.out.println("Страву не знайдено")
    }

    public List<OrderItem> getItems() { 
        return items;
    }

    public double getSubtotal() {
        double total = 0;
        for (OrderItem item : items){
            total += item.getLineTotal();
        }
        return total;
    }
}
