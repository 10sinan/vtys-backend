package com.vtys.medpadd.dto.comicContents;

import com.vtys.medpadd.dto.content.DtoContent;
import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    comic_contents tablosunun base dto'su
    geri döndüreceği veriler bunlar
 */
public record DtoComicContents(
        UUID id,
        DtoContent content,
        DtoMedia media,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
