import java.util.List;

public interface ReceiptPrinter {
    void print(List<OrderItem> items, double subtotal,
               double total, String discountInfo);
}
