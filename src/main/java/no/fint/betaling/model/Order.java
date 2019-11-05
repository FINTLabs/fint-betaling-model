package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;
import java.util.List;

@Data
public class Order {
    private List<OrderLine> orderLines;
    private List<Customer> customers;
    private URI principal;
    private String requestedNumberOfDaysToPaymentDeadline;
}
