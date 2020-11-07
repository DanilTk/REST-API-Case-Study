package pl.dan.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Address shippingAddress;
    private Customer customer;
}
