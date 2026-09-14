import java.util.*;

class Product {
    private String productName;
    private double price;
    private int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName; this.price = price; this.quantity = quantity;
    }
    public String toString() {
        return productName + " x" + quantity + " = " + (price * quantity);
    }
    double total() { return price * quantity; }
}

class Order {
    private String orderId;
    private List<Product> products = new ArrayList<>();

    Order(String orderId) { this.orderId = orderId; }
    void addProduct(Product p) { products.add(p); }
    double calculateTotal() {
        double total = 0;
        for (Product p : products) total += p.total();
        return total;
    }
    public String toString() {
        StringBuilder s = new StringBuilder("Order ID: " + orderId + "\nProducts:\n");
        for (Product p : products) s.append(p).append("\n");
        s.append("Total: ").append(calculateTotal());
        return s.toString();
    }
}

public class Q4_OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());
        Order order = new Order(id);
        for (int i = 0; i < n; i++) {
            String[] x = sc.nextLine().split(",");
            order.addProduct(new Product(x[0].trim(), Double.parseDouble(x[1].trim()),
                    Integer.parseInt(x[2].trim())));
        }
        System.out.print(order);
    }
}
