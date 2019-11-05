package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;

@Data
public class OrderLine {
    private URI itemUri;
    private String description;
    private Long numberOfItems;
    private Long itemPrice;

    public Long sum() {
        return numberOfItems * itemPrice;
    }
}
