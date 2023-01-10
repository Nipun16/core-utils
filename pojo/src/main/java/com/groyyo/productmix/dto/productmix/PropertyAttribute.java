package com.groyyo.productmix.dto.productmix;

import com.groyyo.productmix.dto.LabelValueDto;
import com.groyyo.productmix.dto.propertytemplate.ZonesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyAttribute {



    private List<ZonesDto> zones;
}
