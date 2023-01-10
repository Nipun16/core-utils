package com.groyyo.sfr.dto.propertyOnboarding;

import com.groyyo.transformations.enums.BrandName;
import com.groyyo.transformations.enums.GenderAllowed;
import com.groyyo.transformations.enums.SubBrandName;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyNameDto {
    private String propertyName;
    private BrandName brandName;
    private SubBrandName subBrandName;
    private GenderAllowed gender;
    private String propertyAction;
    private boolean update;
    private Date createdAt;
}
