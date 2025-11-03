package com.vtys.medpadd.dto.systemRoles;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record DtoSystemRole(
        UUID id,
        String roleName,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
