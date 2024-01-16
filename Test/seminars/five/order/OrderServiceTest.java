package seminars.five.order;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private static PaymentService paymentService;
    private static OrderService orderService;

    @BeforeAll
    static void setUp() {
        paymentService = new PaymentService();
        orderService = new OrderService(paymentService);
    }

    @Test
    void placeOrder() {
        assertTrue(orderService.placeOrder("someid", 100.0));
    }
}