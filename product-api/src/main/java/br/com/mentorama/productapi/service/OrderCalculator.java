package br.com.mentorama.productapi.service;

import br.com.mentorama.productapi.model.OrderItem;

import java.util.List;

public class OrderCalculator {

    public Double calculateOrder(final List<OrderItem> items) {
        return items.stream().mapToDouble(OrderItem::totalPrice)
               .sum();
    }
}
