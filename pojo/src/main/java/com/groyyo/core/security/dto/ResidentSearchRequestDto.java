package com.groyyo.core.security.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import java.util.List;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentSearchRequestDto extends AbstractDto {
    private String searchKeyword;

    private List<String> residence;

    private List<String> phoneTypes;
}
