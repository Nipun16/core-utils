package com.groyyo.designservice.response.dto;

import com.groyyo.designservice.enums.PhoenixDesignStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class PhoenixDashboardResponseDto {

	private Long totalRecords;

	private Integer totalPages;

	List<PhoenixDto> phoenixList;

	Map<PhoenixDesignStatus, String> phoenixDesignStatusDescription;

	List<PhoenixDesignStatusCountDto> phoenixDesignStatusCountList;

	Map<PhoenixDesignStatus, Integer> phoenixDesignStatusCount;

}
