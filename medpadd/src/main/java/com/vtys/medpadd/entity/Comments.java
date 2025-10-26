package com.vtys.medpadd.entity;

import java.util.UUID;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@AllArgsConstructor
public class Comments extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "id")
    private Content content;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;

}
