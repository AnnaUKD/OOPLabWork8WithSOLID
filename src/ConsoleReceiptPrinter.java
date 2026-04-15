import java.util.ArrayList;

public class ConsoleReceiptPrinter implements ReceiptPrinter {

    public void print(ArrayList<OrderItem> items, double subtotal, double total, String discountInfo) {

        System.out.println("========== ЧЕК ==========");
        System.out.println("Кафе 'Затишок'");
        System.out.println("-------------------------");

        for (int i = 0; i < items.size(); i++) {
            OrderItem item = items.get(i);
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
