import java.util.List;

public class TextReceiptPrinter implements ReceiptPrinter {

    public void print(List<OrderItem> items, double subtotal, double total, String discountInfo) {
        String result = "Кафе 'Затишок' | ";

        for (int i = 0; i < items.size(); i++) {
            OrderItem item = items.get(i);
            result = result + item.menuItem.name + " x" + item.count + ", ";
        }

        result = result + "| " + discountInfo + " | До сплати: " + total + " грн";
        System.out.println("[SMS]: " + result);
    }
}
