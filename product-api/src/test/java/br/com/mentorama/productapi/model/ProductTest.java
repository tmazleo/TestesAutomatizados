package br.com.mentorama.productapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void deveCalcularPrecoDescontado() {
        Product product = new Product(1l, "TESTE", 100.0, 0.10);
        Double result = product.getPriceWithDiscount(0.10);
        assertEquals(90.0, result);
    }

    @Test
    public void deveCaulcularUltrapassagemDeDesconto() {
        Product product = new Product(1l, "TESTE", 100.0, 0.10);
        Double result = product.getPriceWithDiscount(0.15);
        assertEquals(90.0, result);
    }

    @Test
    public void deveCaulcularMenorDeDesconto() {
        Product product = new Product(1l, "TESTE", 100.0, 0.10);
        Double result = product.getPriceWithDiscount(0.05);
        assertEquals(95.0, result);
    }
}
