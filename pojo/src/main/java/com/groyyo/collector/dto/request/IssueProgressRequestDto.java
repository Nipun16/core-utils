package com.groyyo.collector.dto.request;

import com.groyyo.core.enums.ResidenceType;
import com.groyyo.dashboard.dto.BaseRequestDto;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@ToString(callSuper = true)
public class IssueProgressRequestDto extends CollectionProgressRequestDto {
    @NotNull
    LocalDate inputDate;
}
