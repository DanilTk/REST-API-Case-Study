package pl.dan.demo;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.dan.demo.model.Order;
import pl.dan.demo.model.OrderDTO;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
            @Override
            protected void configure() {
                map().setCity(source.getShippingAddress().getCity());
                map().setStreet(source.getShippingAddress().getStreet());
                map().setName(source.getCustomer().getName());
                map().setDate(LocalDate.now());
            }
        });
        return modelMapper;
    }
}
