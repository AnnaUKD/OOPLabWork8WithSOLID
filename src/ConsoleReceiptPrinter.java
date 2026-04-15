import java.util.List;

public class ConsoleReceiptPrinter implements ReceiptPrinter {

    public void print(List<OrderItem> items, double subtotal, double total, String discountInfo) {

        System.out.println("========== ЧЕК ==========");
        System.out.println("Кафе 'Затишок'");
        System.out.println("-------------------------");

        for (OrderItem item : items) {
            double lineTotal = item.getLineTotal();
            System.out.println(item.menuItem.name + " x" + item.count + " = " + lineTotal + " грн");
        }

        System.out.println("-------------------------");
        System.out.println("Підсума: " + subtotal + " грн");
        System.out.println(discountInfo);
        System.out.println("До сплати: " + total + " грн");
        System.out.println("=========================");
    }
}
