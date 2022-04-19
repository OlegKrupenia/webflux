package com.example.webflux.domain;

//import com.krupenia.domain.user.User;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
@Table(value = "orders")
public class Order {
    @Id
    Integer orderId;
//    @Column
    Integer quantity;
//    @ManyToOne(fetch = FetchType.LAZY)
//    User user;
}
