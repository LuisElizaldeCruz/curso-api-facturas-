package com.andres.curso.springboot.di.factura.proyectodifactura.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Component
@RequestScope
public class Invoice {

    @Autowired
    private Client client;
    @Value("${invoice.description.office}")
    private String description;
    @Autowired
    private List<Item> items;//se puede agregar el metodo @Qualifier

    @PostConstruct//se ecuata despues de que se allan instanciado los objetos y metodos por lo que se puede llamar a diferencia del constructor
    public void init(){
        System.out.println("Creando el componente de la factura");
        client.setName(client.getName().concat(" Eduardo"));
        description = description.concat(" del cliente: ").concat(client.getName()).concat(" ").concat(client.getLastName());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destruyendo el componente o bean factura");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public int getTotal(){
        int total = 0;
        for(Item item : items){
            total += item.getImporte();
        }
        return total;
    }
}
