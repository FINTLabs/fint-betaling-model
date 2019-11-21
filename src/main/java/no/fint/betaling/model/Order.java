package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;
import java.util.List;

@Data
public class Order {
    private List<OrderItem> orderItems;
    private List<Customer> customers;
    private URI principalUri;
    private String requestedNumberOfDaysToPaymentDeadline;

    public Long sum() {
        return orderItems.stream().mapToLong(OrderItem::sum).sum();
    }
}
