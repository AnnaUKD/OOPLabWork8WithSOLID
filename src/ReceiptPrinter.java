import java.util.List;

interface ReceiptPrinter {
    void print(List<OrderItem> items, double subtotal,
               double total, String discountInfo);
}