package com.vtys.medpadd.dto.contentCreatorTags;

import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    content_creator_tags tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoContentCreatorTag(
        UUID id,
        DtoMedia icon,
        String name,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
