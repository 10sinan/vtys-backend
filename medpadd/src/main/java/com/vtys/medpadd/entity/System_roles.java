package com.vtys.medpadd.entity;

import java.util.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "systemroles")
@NoArgsConstructor
@AllArgsConstructor
public class System_roles extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String roleName;

    @Column
    private String description;

}
