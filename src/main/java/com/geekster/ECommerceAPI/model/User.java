package com.geekster.ECommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_email",unique = true)
    private String userEmail;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_phone_number",unique = true)
    private String userPhoneNumber;
}
//  Id:Long
//  name:string
//  email:string
//  password:string
//  phoneNumber:string