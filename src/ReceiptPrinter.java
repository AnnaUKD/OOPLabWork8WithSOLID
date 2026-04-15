import java.util.ArrayList;

public interface ReceiptPrinter {
    void print(ArrayList<OrderItem> items, double subtotal,
               double total, String discountInfo);
}
