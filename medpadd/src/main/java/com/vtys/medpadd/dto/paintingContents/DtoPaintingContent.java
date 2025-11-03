package com.vtys.medpadd.dto.paintingContents;

import com.vtys.medpadd.dto.content.DtoContent;
import com.vtys.medpadd.dto.media.DtoMedia;

import java.util.UUID;

/*
    painting_contents tablosunun base dto'su.
    Geri döndüreceği veriler bunlar.
 */
public record DtoPaintingContent(
        UUID id,
        DtoContent content,
        DtoMedia image,
        String style,
        String description
) {
}
