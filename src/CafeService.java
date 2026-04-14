class CafeService {
    private final OrderManager orderManager;
    private final DiscountCalculator discountCalculator;
    private final ReceiptPrinter receiptPrinter;

    public CafeService(OrderManager orderManager,
                       DiscountCalculator discountCalculator,
                       ReceiptPrinter receiptPrinter) {
        this.orderManager = orderManager;
        this.discountCalculator = discountCalculator;
        this.receiptPrinter = receiptPrinter;
    }

    public void addItem(String name, int qty) {
        orderManager.addItem(name, qty);
    }

    public void checkout() {
        double subtotal = orderManager.getSubtotal();
        double total = discountCalculator.calculate(subtotal);
        receiptPrinter.print(
                orderManager.getItems(),
                subtotal,
                total,
                discountCalculator.getDiscountInfo()
        );
    }
}