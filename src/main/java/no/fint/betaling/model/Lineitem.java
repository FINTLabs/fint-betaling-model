package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;

@Data
public class Lineitem {
    private String itemCode;
    private Long itemPrice;
    private Long taxrate;
    private String description;
    private URI uri;
}