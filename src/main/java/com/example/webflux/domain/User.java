package com.example.webflux.domain;

import lombok.*;

//import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
//@Table(name = "users")
public class User {
//    @Id
    UUID userId;
//    @Column(name = "first_name")
    String firstName;
//    @Column(name = "last_name")
    String lastName;
//    @Column(name = "phone")
    String phone;
//    @OneToMany(
//            mappedBy = "user",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
//        order.setUser(this);
    }

    public void removeOrder(Order order) {
        orders.add(order);
//        order.setUser(null);
    }
}
