package com.groyyo.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MetadataDto {
    private String uuid;
    @NotBlank(message = "Name cannot be null")
    private String name;
    @NotBlank(message = "Position cannot be null")
    private int position;
}
