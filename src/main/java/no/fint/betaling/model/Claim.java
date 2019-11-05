package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class Claim {
    private String orderNumber;
    private String invoiceNumber;
    private LocalDate invoiceDate;
    private LocalDate paymentDueDate;
    private LocalDate createdDate;
    private LocalDate lastModifiedDate;
    private List<CreditNote> creditedAmount;
    private Long amountDue;
    private Long originalAmountDue;
    private String requestedNumberOfDaysToPaymentDeadline;
    private Customer customer;
    private User createdBy;
    private URI principalUri;
    private URI invoiceUri;
    private List<OrderLine> orderLines;
    private ClaimStatus claimStatus;
    private String statusMessage;
    private Set<String> classes;
}
