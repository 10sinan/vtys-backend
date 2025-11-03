package com.vtys.medpadd.dto.users;

import com.vtys.medpadd.dto.media.DtoMedia;
import com.vtys.medpadd.dto.systemRoles.DtoSystemRole;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record DtoUser(
        UUID id,
        String firstName,
        String lastName,
        String username,
        String email,
        DtoSystemRole systemRole,
        LocalDate birthday,
        DtoMedia profilePic,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
