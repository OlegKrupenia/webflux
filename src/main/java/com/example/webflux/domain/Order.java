package com.example.webflux.domain;

//import com.krupenia.domain.user.User;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
//@Table(name = "orders")
public class Order {
    @Id
    Long orderId;
//    @Column
    Integer quantity;
//    @ManyToOne(fetch = FetchType.LAZY)
//    User user;
}
