package com.vtys.medpadd.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(BaseEntity.EntityListener.class)
@Data
public abstract class BaseEntity {
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public static class EntityListener {
        @PrePersist
        public void prePersist(BaseEntity entity) {
            entity.prePersist();
        }

        @PreUpdate
        public void preUpdate(BaseEntity entity) {
            entity.preUpdate();
        }
    }
}
