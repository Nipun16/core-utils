package com.groyyo.ventaAudit.dto;

import com.groyyo.ventaAudit.enums.DueDates;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountDueDateResponseDto {
   DueDates dueDates;
   Long count;
}
