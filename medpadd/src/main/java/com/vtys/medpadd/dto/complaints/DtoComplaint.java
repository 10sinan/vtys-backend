package com.vtys.medpadd.dto.complaints;

import com.vtys.medpadd.dto.media.DtoMedia;
import com.vtys.medpadd.dto.users.DtoUser;

import java.time.LocalDateTime;
import java.util.UUID;

/*
    complaints tablosunun base dto'su
    geri döndüreceği veriler bunlar.
    target değeri generic çünkü user, comment veya content olabilir, null bile olabilir.

 */
public record DtoComplaint<T>(
        UUID id,
        DtoUser user,
        DtoMedia media,
        T target,
        String targetType,
        String title,
        String complaint,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
