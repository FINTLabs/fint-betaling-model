package no.fint.betaling.model;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private String postalAddress;
    private String postalCode;
    private String city;
    private String person;
}