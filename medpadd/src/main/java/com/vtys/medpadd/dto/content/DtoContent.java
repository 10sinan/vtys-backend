package com.vtys.medpadd.dto.content;

import com.vtys.medpadd.dto.contentCreators.DtoContentCreator;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    content tablosunun base dto'su
    geri döndüreceği veriler bunlar.
 */
public record DtoContent(
        UUID id,
        DtoContentCreator contentCreator,
        String title,
        Double price,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
