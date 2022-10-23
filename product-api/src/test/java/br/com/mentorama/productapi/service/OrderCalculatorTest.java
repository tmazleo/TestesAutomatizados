package br.com.mentorama.productapi.service;

import br.com.mentorama.productapi.model.OrderItem;
import br.com.mentorama.productapi.model.Product;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderCalculatorTest {

    @Test
    public void shouldCalculateTotalOrderPrice() {
        final OrderCalculator orderCalculator = new OrderCalculator();
        final List<OrderItem> orderItems = Arrays.asList(
            aOrderItem(2, 0.0, 10.0, 0.10),
                aOrderItem(10, 0.0, 1.0, 0.10)
        );
        Double result = orderCalculator.calculateOrder(orderItems);
        assertEquals(30.0, result);
    }

    private OrderItem aOrderItem(final Integer quantity, final Double discount, final Double price, final Double maxDiscountPercentage) {
        Product product = new Product(1L, "TESTE", price,  maxDiscountPercentage);
        return  new OrderItem(product, quantity, discount);
    } //metodo para criar varios itens

}