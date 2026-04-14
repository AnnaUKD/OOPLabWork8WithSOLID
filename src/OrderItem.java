public class OrderItem {
    private final MenuItem menuItem;
    private final int qty;

    public OrderItem(MenuItem menuItem, int qty) {
        this.menuItem = menuItem;
        this.qty = qty;
    }
    public MenuItem getMenuItem() {
        return menuItem;
    }
    public int getQty() {
        return qty;
    }
    public double getLineTotal(){
        return menuItem.getPrice() * qty;
    }
}
