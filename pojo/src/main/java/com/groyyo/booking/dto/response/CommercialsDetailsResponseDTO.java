package com.groyyo.booking.dto.response;

import com.groyyo.booking.dto.MonthlyBreakupDto;
import com.groyyo.booking.enums.AMCAmountType;
import com.groyyo.booking.enums.MaintenanceFeeCollectionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialsDetailsResponseDTO implements Serializable {

    private Double securityDeposit;

    private Double maintenanceFee;

    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;

    private AMCAmountType maintenanceChargeAmountType;

    private Double bookingAmount;

    private Double onBoardingCharges;

    private Double onBoardingChargesPercentage;

    private Boolean onboardingChargesApplicableOnRetention;

    private Double totalAmount;

    private Double discountApplied;

    private MonthlyBreakupDto monthlyBreakup;

    private AdvanceRentalDto startingAdvanceRental;

    private AdvanceRentalDto lastAdvanceRental;

}

