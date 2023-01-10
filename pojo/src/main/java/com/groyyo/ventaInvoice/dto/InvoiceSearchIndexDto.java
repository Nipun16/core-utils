package com.groyyo.ventaInvoice.dto;

import com.groyyo.core.base.common.dto.AbstractSearchIndexDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceSearchIndexDto extends AbstractSearchIndexDto {
    private LocalDate issueDate;
    private String groyyoDocumentId;
    private String residentId;
    private String residenceMicromarketUuid;
    private String residenceCityUuid;
    private String residenceUuid;
}
