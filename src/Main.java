import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Меню кафе
        List<MenuItem> menu = List.of(
                new MenuItem("Кава", 45.0),
                new MenuItem("Чай", 30.0),
                new MenuItem("Круасан", 55.0),
                new MenuItem("Тістечко", 70.0)
        );

        System.out.println("=== SOLID — Знижка на обсяг (консольний чек) ===");
        CafeService service1 = new CafeService(
                new OrderManager(menu),
                new DiscountCalculator(new VolumeDiscount(200, 10)),
                new ConsoleReceiptPrinter()
        );
        service1.addItem("Кава", 2);
        service1.addItem("Круасан", 3);
        service1.addItem("Тістечко", 1);
        service1.checkout();

        System.out.println("=== SOLID — Святкова знижка (SMS-чек) ===");
        CafeService service2 = new CafeService(
                new OrderManager(menu),
                new DiscountCalculator(new HolidayDiscount(15)),
                new TextReceiptPrinter()
        );
        service2.addItem("Чай", 2);
        service2.addItem("Тістечко", 2);
        service2.checkout();

        System.out.println("=== SOLID — Акція «1+1» (консольний чек) ===");
        CafeService service3 = new CafeService(
                new OrderManager(menu),
                new DiscountCalculator(new BuyOneGetOneDiscount()),
                new ConsoleReceiptPrinter()
        );
        service3.addItem("Кава", 1);
        service3.addItem("Кава", 1);
        service3.checkout();

        System.out.println("=== SOLID — Знижка постійного клієнта (консольний чек) ===");
        CafeService service4 = new CafeService(
                new OrderManager(menu),
                new DiscountCalculator(new LoyaltyDiscount()),
                new ConsoleReceiptPrinter()
        );
        service4.addItem("Чай", 3);
        service4.addItem("Круасан", 2);
        service4.checkout();
    }
}
