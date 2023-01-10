package com.groyyo.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.groyyo.invoice.enums.Category;
import com.groyyo.invoice.enums.ExpenseType;
import com.groyyo.invoice.enums.InvoiceType;
import com.groyyo.invoice.enums.VoucherType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class OracleIntegrationInvoiceDto extends AbstractOracleDto {

    private String groyyoId;
    private String documentNumber;
    private String date;
    private String dueDate;
    private String vendor;
    private String location;
    private String currency;
    private String billingState;
    private String billingCountry;
    private String invoiceNumber;
    private BigDecimal invoiceAmount;
    private BigDecimal advanceAdjusted;
    private String documentUrl;
    private double exchangeRate;
    private String purchaseOrderNumber;
    private InvoiceType invoiceType;
    private String documentName;
    private String invoiceCopy;
    private String vendorCode;
    private VoucherType voucherType;
    private Category category;
    private String vertical;
    private String group;
    private String subGroup;
    private ExpenseType expenseType;
    @JsonProperty("GL_Code")
    private String glCode;
    private String narration;
    private String taxCode;
    private String tdsSection;
    private Double tdsRate;
    private BigDecimal tdsAmount;
    private BigDecimal provision;
    private BigDecimal difference;
    private BigDecimal retentionAmount;
    @JsonProperty("retention_percentage")
    private String retentionPercent;
    private String retentionDueDate;
    private List<OracleIntegrationInvoiceItemDto> itemList;
    private String poNumber;
    private String invoiceDate;
    private String memo;
    @JsonProperty("service_period_start_date")
    private String servicePeriodStartDate;
    @JsonProperty("service_period_end_date")
    private String servicePeriodEndDate;


}
