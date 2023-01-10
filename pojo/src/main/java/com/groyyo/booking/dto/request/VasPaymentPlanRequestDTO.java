package com.groyyo.booking.dto.request;

import com.groyyo.booking.dto.request.ServicePriceDto;
import com.groyyo.booking.dto.request.VasPriceDto;
import com.groyyo.booking.enums.BookingType;
import com.groyyo.booking.enums.PaymentTerm;
import com.groyyo.booking.enums.ReferenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VasPaymentPlanRequestDTO implements Serializable {

    @NotEmpty(message = "referenceId cannot be null or blank")
    private String referenceId;

    @Builder.Default
    private ReferenceType referenceType = ReferenceType.BOOKING;

    @NotNull(message = "contractStartDate cannot be null")
    private Date contractStartDate;

    private Date subContract1EndDate;

    @NotNull(message = "contractEndDate cannot be null")
    private Date contractEndDate;

    private Date stayLockInDate;

    private BookingType bookingType;

    @Builder.Default
    private Integer startingAdvanceRentalMonths = 1;

    @Builder.Default
    private Integer lastAdvanceRentalMonths = 0;

    private List<ServicePriceDto> vasPriceDtos;

    @Builder.Default
    private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

    private Boolean savePaymentPlan = false;

    private Boolean isModifyContract = false;

    private Boolean isGenerateInvoice =false;

    private String residenceUuid;

    private String residentUuid;

}
