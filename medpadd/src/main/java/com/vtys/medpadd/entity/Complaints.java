package com.vtys.medpadd.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "complaints")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Complaints extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    private Media media;

    /*
    @Column(name = "target_id")
    private UUID targetId;
    */

    @Column(name = "target_type")
    private String targetType;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String complaint;
}
