package com.vtys.medpadd.dto.contentCreatorVerificationBadges;

import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    content_creator_verification_badges tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoContentCreatorVerificationBadge(
        UUID id,
        DtoMedia media,
        String code,
        String name,
        String color,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
