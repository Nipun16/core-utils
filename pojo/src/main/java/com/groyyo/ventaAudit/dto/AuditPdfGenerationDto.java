package com.groyyo.ventaAudit.dto;

import com.groyyo.ventaInvoice.dto.BillFromDto;
import com.groyyo.ventaInvoice.dto.BillToDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AuditPdfGenerationDto {
    private BillFromDto billFromDto;
    private BillToDTO billToDto;
    private StayDetailsDto stayDetailsDto;
    private List<PdfDamageSectionDto> damageSectionDtoList;
    private Double AmountPayable;
    private String auditUuid;

}
