package com.example.employee.employees.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employeeAddress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "address")
    private String address;
    @Column(name = "pincode")
    private Integer pincode;
    @Column(name = "state")
    private String state;
}
