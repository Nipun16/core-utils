package com.groyyo.productmix.dto.productmix;

import com.groyyo.productmix.dto.LabelValueDto;
import com.groyyo.productmix.dto.propertytemplate.ZonesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixDtoWithValidations {

    @NotNull (message = "Product mix details cannot be null")
    @Valid
    private ProductMixDetails productMixDetails;

    private List<LabelValueDto<String>> roomTemplateOptions;

    private List<LabelValueDto<String>> allConsumablesList;

    private List<LabelValueDto<String>> allRoomFeaturesList;

    @NotNull(message = "Room attributes cannot be null")
    @Valid
    private RoomAttributeDto roomAttribute;

    @NotNull(message = "Property attributes cannot be null")
    @Valid
    private PropertyAttributeDto propertyAttribute;

}
