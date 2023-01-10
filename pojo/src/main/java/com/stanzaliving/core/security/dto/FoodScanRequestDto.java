package com.stanzaliving.core.security.dto;

import java.time.LocalDate;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodScanRequestDto {
    private Collection<String> userId;
    
    @NotNull
    private LocalDate date;
}
