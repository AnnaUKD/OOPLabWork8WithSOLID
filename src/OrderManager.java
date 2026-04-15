import java.util.ArrayList;

public class OrderManager {

    ArrayList<MenuItem>  menu  = new ArrayList<MenuItem>();
    ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    public OrderManager(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public void addItem(String name, int count) {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem m = menu.get(i);
            if (m.name.equals(name)) {
                items.add(new OrderItem(m, count));
                System.out.println("Додано: " + name + " x" + count);
                return;
            }
        }
        System.out.println("Страву не знайдено: " + name);
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public double getSubtotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getLineTotal();
        }
        return total;
    }
}
