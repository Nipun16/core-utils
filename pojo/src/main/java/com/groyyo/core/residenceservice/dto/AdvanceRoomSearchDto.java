package com.groyyo.core.residenceservice.dto;

import com.groyyo.core.base.common.dto.RoommateFilterDto;
import com.groyyo.core.residenceservice.enums.ResidenceSortBy;
import com.groyyo.core.residenceservice.enums.RoomStatus;
import com.groyyo.core.utilservice.annotations.DateFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceRoomSearchDto {

    private String residenceUuid;

    private String roomNumber;

    private List<Integer> occupancies;

    private List<String> floors;

    private List<RoomStatus> roomStatus;

    @DateFormat(message = "Move-in date is invalid | Expected format 'yyyy-dd-MM'")
    @NotBlank(message = "Move-in date cannot be empty")
    private String moveInDate;

    private List<String> attributes;

    private Double inventoryMinPrice;

    private Double inventoryMaxPrice;

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer limit = 10;

    private ResidenceSortBy sortBy;

    private String moveOutDate;

    private String microMarketId;
    private String residenceName;
    private List<Integer> bhkType;
    private Boolean inventoryView;

    private RoommateFilterDto roommateFilterDto;

    private List<String> roomUuids;

}
