package br.com.mentorama.productapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    @Test
    public void deveCalcularPrecoTotal() {
        final Product product = new Product(1l, "cocacola", 10.0, 5.0);
        final OrderItem orderItem = new OrderItem(product, 3, 0.0);
        final Double result = orderItem.totalPrice();
        assertEquals(30.0, result);
    }
}