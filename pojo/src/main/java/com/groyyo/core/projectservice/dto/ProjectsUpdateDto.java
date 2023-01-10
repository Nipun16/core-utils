package com.groyyo.core.projectservice.dto;

import com.groyyo.core.leadership.dto.PropertyNamingDto;
import com.groyyo.core.pojo.AttachmentDto;
import com.groyyo.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsUpdateDto {
    String propertyUuid;
    LocalDateTime timestamp;
    PropertyUpdateEnum propertyUpdateEnum;
    String userId;
    Map<String,String> additionalData;
    PropertyNamingDto propertyNamingDto;
    Map<String,List<AttachmentDto>> attachmentDtoList;
}
