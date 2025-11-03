package com.vtys.medpadd.dto.comments;

import com.vtys.medpadd.dto.content.DtoContent;
import com.vtys.medpadd.dto.users.DtoUser;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    comments tablosunun base dto'su
    geri döndüreceği veriler bunlar
 */
public record DtoComment(
        UUID id,
        DtoContent content,
        DtoUser user,
        String text,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
