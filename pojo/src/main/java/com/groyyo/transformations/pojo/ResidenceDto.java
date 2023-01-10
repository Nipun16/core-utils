/**
 *
 */
package com.groyyo.transformations.pojo;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.enums.PropertyEntityType;
import com.groyyo.core.enums.ResidenceBrand;
import com.groyyo.core.enums.ResidenceType;
import com.groyyo.core.estate.enums.EstateGender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceDto extends AbstractDto {

    /**
     *
     */
    private static final long serialVersionUID = -4483658093423365401L;

    private String residenceName;

    private String micromarketUuid;

    private ResidenceType residenceType;

    private ResidenceBrand brandName;

    private int bedCount;

    private int roomCount;

    private EstateGender estateGender;

    private Integer coreResidenceId;

    private String coreResidenceName;

    private String residenceSlug;

    private String estateUuid;

    private String phoenixPropertyUuid;

    private String parentResidenceId;

    private PropertyEntityType propertyEntityType;

    private String code;

    private String category;

    private String company;

    private String addressUuid;

    private Boolean bookingStatus;

    private Double latitude;

    private Double longitude;

    private String apartmentType;
}