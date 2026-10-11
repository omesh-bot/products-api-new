package uk.ac.westminster.products_api;

import lombok.*;

@AllArgsConstructor
public class Address {
    private String street;
    private String city;
    private String postcode;

    public String getStreet(){return street;}

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
