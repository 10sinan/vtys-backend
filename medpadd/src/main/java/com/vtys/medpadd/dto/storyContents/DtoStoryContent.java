package com.vtys.medpadd.dto.storyContents;

import com.vtys.medpadd.dto.content.DtoContent;
import com.vtys.medpadd.dto.media.DtoMedia;

import java.time.LocalDateTime;
import java.util.UUID;

public record DtoStoryContent(
        UUID id,
        DtoContent content,
        String text,
        DtoMedia media,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
