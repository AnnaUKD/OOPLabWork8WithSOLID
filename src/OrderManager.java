import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    List<MenuItem>  menu  = new ArrayList<MenuItem>();
    List<OrderItem> items = new ArrayList<OrderItem>();

    public OrderManager(List<MenuItem> menu) {
        this.menu = menu;
    }

    public void addItem(String name, int count) {
        for (MenuItem m : menu) {
            if (m.name.equals(name)) {
                items.add(new OrderItem(m, count));
                System.out.println("Додано: " + name + " x" + count);
                return;
            }
        }
        System.out.println("Страву не знайдено: " + name);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getSubtotal() {
        double total = 0;
        for (OrderItem item : items) {
            total = total + item.getLineTotal();
        }
        return total;
    }
}
