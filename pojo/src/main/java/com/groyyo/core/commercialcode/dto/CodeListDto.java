package com.groyyo.core.commercialcode.dto;
import com.groyyo.booking.enums.AMCAmountType;
import com.groyyo.commercialcard.enums.CommercialCardStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CodeListDto {
    private String uuid;

    private String commercialCodeName;

    private Double refundableDeposit;

    private Integer advanceRentalFirstMonths;

    private Integer advanceRentalLastMonths;

    private Double annualMaintenanceFee;

    private Double monthlyMaintenanceFee;

    private String maintenanceFeeCollection;

    private boolean isAutoApplicable;

    private Boolean isSecurityDepositManualInput;

    private Double monthlyFeesMultiplier;

    private Double onBoardingCharges;

    private Double onBoardingChargesPercentage;

    private Boolean onboardingChargesApplicableOnRetention;

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private AMCAmountType maintenanceChargeAmountType;

    private CommercialCardStatus cardStatus;
}
