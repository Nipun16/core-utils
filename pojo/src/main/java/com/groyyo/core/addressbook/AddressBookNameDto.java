package com.groyyo.core.addressbook;

import com.groyyo.transformations.enums.LocationType;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddressBookNameDto {

    private LocationType locationType;
    private String addressUuid;
    private String locationName;
}
