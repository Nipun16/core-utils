package com.groyyo.invoice.dto;

import com.groyyo.invoice.enums.InvoiceStatus;
import com.groyyo.invoice.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceBasicDetailsDto {

    private String uuid;

    private String poUuid;

    private String invoiceCode;

    private InvoiceType invoiceType;

    private String vendorInvoiceRef;

    private Date invoiceDate;

    private BigDecimal invoiceAmt;

    private String invoiceCopy;

    private Date invoicePayDueDate;

    private InvoiceStatus invoiceStatus;

    private String lastApprovedBy;

}
