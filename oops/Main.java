class Order{
    public int orderId;
    public String orderStatus;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
}

public class main{
    static void main() {
        Order order = new Order();
    }
}