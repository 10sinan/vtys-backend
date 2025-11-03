package com.vtys.medpadd.dto.comicPages;

import com.vtys.medpadd.dto.content.DtoContent;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    comic_pages tablosunun base dto'su
    geri döndüreceği veriler bunlar
 */
public record DtoComicPage(
        UUID id,
        DtoContent comic,
        String pageUrl,
        Integer page,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
