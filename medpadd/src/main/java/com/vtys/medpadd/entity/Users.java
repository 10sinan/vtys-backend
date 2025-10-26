package com.vtys.medpadd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class Users extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String username;

    @Column
    private LocalDate birthDay;


    @ManyToOne // her kullanıcı bir role sahip olabilir
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private System_roles role;

    @OneToOne // her kullanıcının bir profil resmi olabilir
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    private Media profile_pic_id;

}
