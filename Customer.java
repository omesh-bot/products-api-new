package uk.ac.westminster.products_api;

import lombok.*;

@AllArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private String email;
    private Address address;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}
