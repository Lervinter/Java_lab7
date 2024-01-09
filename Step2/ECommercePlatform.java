import java.util.Map;

public class ECommercePlatform {
    private Map<Integer, User> users;
    private Map<Integer, Product> products;
    private Map<Integer, Order> orders;

    // Конструктор

    public void addUser(User user) {
        // Додавання користувача
    }

    public void addProduct(Product product) {
        // Додавання товару
    }

    public Order createOrder(int userId, Map<Product, Integer> orderDetails) {
        // Створення замовлення
    }

    public void updateStock(Product product, int quantity) {
        // Оновлення запасів товару
    }

    public void displayAvailableProducts() {
        // Виведення списку доступних товарів
    }

    // Інші методи для роботи з користувачами, товарами та замовленнями
}
