package com.example.webflux.domain;


import lombok.*;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
//@Table(name = "tyres")
public class Tyre {
//    @Id
    UUID tyreId;
//    @Column
    String title;
//    @Column
    Float price;
}
