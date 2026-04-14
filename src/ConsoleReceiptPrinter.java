import java.util.List;

class ConsoleReceiptPrinter implements ReceiptPrinter {
    @Override
    public void print(List<OrderItem> items, double subtotal,
                      double total, String discountInfo) {
        System.out.println("\n========== ЧЕК ==========");
        System.out.println("Кафе 'Затишок'");
        System.out.println("-------------------------");
        for (OrderItem item : items) {
            System.out.printf("%-10s x%d = %.2f грн%n",
                    item.getMenuItem().getName(),
                    item.getQty(),
                    item.getLineTotal());
        }
        System.out.println("-------------------------");
        System.out.printf("Підсума:     %.2f грн%n", subtotal);
        System.out.println(discountInfo);
        System.out.printf("До сплати:   %.2f грн%n", total);
        System.out.println("=========================\n");
    }
}