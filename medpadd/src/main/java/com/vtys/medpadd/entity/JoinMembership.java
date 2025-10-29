package com.vtys.medpadd.entity;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "join_membership")
@NoArgsConstructor
@AllArgsConstructor
public class JoinMembership extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JoinColumn(name = "contentCreators_id", referencedColumnName = "id")// bu ilişki birçok üyeliği bir içerik oluşturucuya bağlar
    @ManyToOne
    private ContentCreators contentCreators;


    @JoinColumn(name = "media_id", referencedColumnName = "id") // bu ilişki birçok üyeliği bir medya öğesine bağlar
    @ManyToOne// bu ilişki birçok rozeti bir medya öğesine bağlar
    private Media icon;

}
