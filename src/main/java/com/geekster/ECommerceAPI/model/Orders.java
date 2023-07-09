package com.geekster.ECommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id.fk")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk.product_id")
    private Product product;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk.address_id")
    private Address address;

    @Column(name = "product_quantity")
    private Integer productQuantity;

}
//    id:integer
//    userID:integer (foreign key mapping)
//    productID:integer(foreign key mapping)
//    addressID:integer(foreign key mapping)
//    productQuantity:integer