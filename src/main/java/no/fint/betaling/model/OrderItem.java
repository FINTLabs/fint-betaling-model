package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;

@Data
public class OrderItem {
    private String itemCode;
    private String itemName;
    private String itemDescription;
    private Long itemQuantity;
    private Long itemPrice;
    private URI itemUri;

    public Long sum() {
        return itemQuantity * itemPrice;
    }
}
