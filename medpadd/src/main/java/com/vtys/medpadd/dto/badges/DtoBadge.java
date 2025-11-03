package com.vtys.medpadd.dto.badges;

import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    badge tablosunun base dto'su.
    Geri döndüreceği veriler bunlar.
 */
public record DtoBadge(
            UUID id,
            DtoMedia icon,
            String color,
            String code,
            String name,
            String description,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
) {
}
