package com.groyyo.ventaInvoice.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.dto.PageAndSortDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceSearchDto extends AbstractDto {
    private String searchKeyword;
    private PageAndSortDto pageDto;
    private List<String> cityIds;
    private List<String> micromarketIds;
    private List<String> residenceIds;
}
