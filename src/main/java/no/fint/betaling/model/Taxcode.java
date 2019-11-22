package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;

@Data
public class Taxcode {
    private String code;
    private Long rate;
    private String description;
    private URI uri;
}