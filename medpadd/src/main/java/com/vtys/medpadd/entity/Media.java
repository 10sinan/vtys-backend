package com.vtys.medpadd.entity;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "media")
@NoArgsConstructor
@AllArgsConstructor
public class Media extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String media_url;

    @Column
    private String media_type;

    @Column
    private String media_size;
}
