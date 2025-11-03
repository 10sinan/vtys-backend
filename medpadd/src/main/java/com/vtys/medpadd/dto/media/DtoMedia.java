package com.vtys.medpadd.dto.media;

import com.vtys.medpadd.dto.users.DtoUser;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    media tablosunun base dto'su.
    Geri döndüreceği veriler bunlar.
 */
public record DtoMedia(
        UUID id,
        DtoUser user,
        String mediaUrl,
        String mediaType,
        String mediaSize,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
