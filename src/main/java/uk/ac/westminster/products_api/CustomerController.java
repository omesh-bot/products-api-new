package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id){
        Address address = new Address("abc", "Alphabet", "999990");
        return new Customer(id, "Bulatha", "Bulatha@example.com", address);
    }

}
