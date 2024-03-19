package com.andres.curso.springboot.di.factura.proyectodifactura;

import com.andres.curso.springboot.di.factura.proyectodifactura.models.Item;
import com.andres.curso.springboot.di.factura.proyectodifactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {
    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony", 800);

        return null;
    }
}
