package com.vtys.medpadd.dto.contentCreators;

import com.vtys.medpadd.dto.users.DtoUser;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    content_creators tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoContentCreator(
        UUID id,
        DtoUser user,
        String biography,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
