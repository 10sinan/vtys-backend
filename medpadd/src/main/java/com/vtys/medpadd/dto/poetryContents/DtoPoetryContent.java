package com.vtys.medpadd.dto.poetryContents;

import com.vtys.medpadd.dto.content.DtoContent;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    poetry_contens tablosunun base dto'su.
    Geri döndüreceği veriler bunlar.
 */
public record DtoPoetryContent(
        UUID id,
        DtoContent content,
        String text,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
