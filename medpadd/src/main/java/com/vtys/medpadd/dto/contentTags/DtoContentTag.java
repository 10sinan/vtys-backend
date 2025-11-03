package com.vtys.medpadd.dto.contentTags;

import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    content_tags tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoContentTag(
        UUID id,
        String name,
        DtoMedia icon,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
