package com.example.carrental.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.Set;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_type")
    private String roleType;



}
