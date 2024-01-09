import java.util.Map;

public class Order {
    private Integer id;
    private Integer userId;
    private Map<Product, Integer> orderDetails;
    private double totalPrice;

    // Конструктори, гетери, сетери

    public double calculateTotalPrice() {
        // Розрахунок загальної вартості замовлення
    }
}
