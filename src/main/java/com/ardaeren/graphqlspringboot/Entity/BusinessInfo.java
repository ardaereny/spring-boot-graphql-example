package com.ardaeren.graphqlspringboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusinessInfo {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public BusinessInfo(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

}
