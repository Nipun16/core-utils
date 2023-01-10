package com.groyyo.designservice.request.dto;

import com.groyyo.designservice.enums.BedType;
import com.groyyo.designservice.enums.PhoenixDesignStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PhoenixDesignStatusUpdateRequestDto {

    private PhoenixDesignStatus phoenixDesignStatus;

    private BedType subBrandName;

    private String propertyUuid;

    private String phoenixDesignRemark;

    private String reasonForNoSumma;

    private String reasonForNoMagna;

    private String reasonForNoPrima;

}
