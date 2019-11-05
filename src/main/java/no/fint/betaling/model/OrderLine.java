package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;

@Data
public class OrderLine {
    private URI lineItem;
    private Long numberOfItems;
}
