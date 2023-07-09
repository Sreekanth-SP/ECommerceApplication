package com.geekster.ECommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "address_name")
    private String addressName;
    private String landmark;
    private String zipCode;
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk.user_id")
    private User user;

}
//       id:Long
//       name:string
//       landmark:string
//       zipcode:string
//       state:string
//       UserID : foreign key mapping