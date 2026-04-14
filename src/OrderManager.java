import java.util.ArrayList;
import java.util.List;

class OrderManager {
    private final List<OrderItem> items = new ArrayList<>();
    private final List<MenuItem>  menu;

    public OrderManager(List<MenuItem> menu) {
        this.menu = menu;
    }

    public void addItem(String itemName, int qty) {
        menu.stream()
                .filter(m -> m.getName().equalsIgnoreCase(itemName))
                .findFirst()
                .ifPresentOrElse(
                        m -> {
                            items.add(new OrderItem(m, qty));
                            System.out.println("Додано: " + itemName + " x" + qty);
                        },
                        () -> System.out.println("Страву не знайдено: " + itemName)
                );
    }

    public List<OrderItem> getItems() { return items; }

    public double getSubtotal() {
        return items.stream().mapToDouble(OrderItem::getLineTotal).sum();
    }
}