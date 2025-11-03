package com.vtys.medpadd.dto.ratings;

import com.vtys.medpadd.dto.content.DtoContent;
import com.vtys.medpadd.dto.users.DtoUser;

import java.time.LocalDateTime;
import java.util.UUID;

public record DtoRatings(
        UUID id,
        Double rating,
        DtoUser user,
        DtoContent content,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
