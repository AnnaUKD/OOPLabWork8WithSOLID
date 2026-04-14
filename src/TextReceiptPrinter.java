import java.util.List;


class TextReceiptPrinter implements ReceiptPrinter {
    @Override
    public void print(List<OrderItem> items, double subtotal,
                      double total, String discountInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Кафе 'Затишок' | Ваше замовлення: ");
        for (OrderItem item : items) {
            sb.append(item.getMenuItem().getName())
                    .append(" x").append(item.getQty()).append(", ");
        }
        sb.append(String.format("| %s | Разом: %.2f грн", discountInfo, total));
        System.out.println("[SMS/Email]: " + sb);
    }
}