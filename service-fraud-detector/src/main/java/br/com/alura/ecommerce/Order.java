package br.com.alura.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String orderId;
    private final BigDecimal amaount;
    private final String email;

    public Order(String orderId, BigDecimal amaount, String email) {
        this.orderId = orderId;
        this.amaount = amaount;
        this.email = email;
    }


    public BigDecimal getAmaount() {
        return amaount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amaount=" + amaount +
                ", email='" + email + '\'' +
                '}';
    }
}
