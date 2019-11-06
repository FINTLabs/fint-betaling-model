package no.fint.betaling.model;

import lombok.Data;

import java.net.URI;

@Data
public class Customer {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private String postalAddress;
    private String postalCode;
    private String city;
    private URI person;
}