package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class Claim {
    private String orgId;
    private String orderNumber;
    private Set<String> invoiceNumbers;
    private LocalDate invoiceDate;
    private LocalDate paymentDueDate;
    private LocalDate createdDate;
    private LocalDate lastModifiedDate;
    private List<CreditNote> creditNotes;
    private Long amountDue;
    private Long originalAmountDue;
    private String requestedNumberOfDaysToPaymentDeadline;
    private Customer customer;
    private User createdBy;
    private Organisation organisationUnit;
    private Principal principal;
    private URI invoiceUri;
    private List<OrderItem> orderItems;
    private ClaimStatus claimStatus;
    private String statusMessage;
    private Set<String> classes;
    private Long timestamp;
}
