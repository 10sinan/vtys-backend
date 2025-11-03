package com.vtys.medpadd.dto.subscriptions;

import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record DtoSubscription(
        UUID id,
        DtoMedia icon,
        String name,
        String description,
        List<String> privileges,
        LocalDateTime createdAt,
        LocalDateTime upatedAt
) {
}
