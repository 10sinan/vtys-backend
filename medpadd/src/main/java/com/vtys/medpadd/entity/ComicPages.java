package com.vtys.medpadd.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "comic_pages")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ComicPages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "comic_id", referencedColumnName = "id")
    private Content comic;

    @Column(name = "page_url")
    private String pageUrl;

    @Column(name = "page")
    private Integer page;
}
