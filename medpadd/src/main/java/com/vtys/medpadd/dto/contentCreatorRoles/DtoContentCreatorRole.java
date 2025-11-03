package com.vtys.medpadd.dto.contentCreatorRoles;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    content_creator_roles tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoContentCreatorRole(
        UUID id,
        String name,
        String code,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
