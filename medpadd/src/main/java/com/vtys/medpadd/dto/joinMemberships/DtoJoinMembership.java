package com.vtys.medpadd.dto.joinMemberships;

import com.vtys.medpadd.dto.contentCreators.DtoContentCreator;
import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    join_memberships tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoJoinMembership(
        UUID uuid,
        DtoContentCreator contentCreator,
        DtoMedia icon,
        String color,
        String name,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
