public class OrderItem {

    MenuItem menuItem;
    int count;

    public OrderItem(MenuItem menuItem, int count) {
        this.menuItem = menuItem;
        this.count    = count;
    }

    public double getLineTotal() {
        return menuItem.price * count;
    }
}
