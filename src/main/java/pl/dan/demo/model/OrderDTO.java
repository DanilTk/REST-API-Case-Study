package pl.dan.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OrderDTO {
    private String city;
    private String street;
    private String name;
    private LocalDate date;
}
