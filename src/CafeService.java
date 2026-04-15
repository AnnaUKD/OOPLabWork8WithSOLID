public class CafeService {
    OrderManager orderManager;
    DiscountCalculator discountCalculator;
    ReceiptPrinter receiptPrinter;

    public CafeService(OrderManager orderManager, DiscountCalculator discountCalculator, ReceiptPrinter receiptPrinter) {
        this.orderManager = orderManager;
        this.discountCalculator = discountCalculator;
        this.receiptPrinter = receiptPrinter;
    }

    public void addItem(String name, int count) {
        orderManager.addItem(name, count);
    }

    public void checkout() {
        double subtotal = orderManager.getSubtotal();
        double total = discountCalculator.calculate(subtotal);
        String info = discountCalculator.getDiscountInfo();

        receiptPrinter.print(orderManager.getItems(), subtotal, total, info);
    }
}
