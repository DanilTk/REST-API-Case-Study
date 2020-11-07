package pl.dan.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dan.demo.model.Order;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private List<Order> orders;
    private final ModelMapper modelMapper;

    public OrderController(ModelMapper modelMapper) {
        this.orders = orders;
    }

    @GetMapping
    public List<Order> getOrders() {
        return orders;
    }
}
