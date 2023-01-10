package com.groyyo.core.security.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.dto.PageAndSortDto;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDefaulterSearchRequestDto extends AbstractDto {

    private String searchKeyword;

    private LocalDate date;

    private PageAndSortDto pageDto;
}
