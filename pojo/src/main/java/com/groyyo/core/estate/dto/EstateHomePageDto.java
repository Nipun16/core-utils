package com.groyyo.core.estate.dto;

import java.util.List;

import com.groyyo.core.base.location.GeoPointDto;
import com.groyyo.core.estate.enums.EstateStatus;
import com.groyyo.core.user.dto.Address;

import lombok.Data;

@Data
public class EstateHomePageDto {

	private String estateName;

	private double sizeOfPlot;

	private int numberOfFloors;

	private int numberOfRooms;

	private GeoPointDto location;

	private String landlordContactNumber;

	private String microMarketName;

	private Address address;

	private List<String> propertyImages;

	private EstateStatus estateStatus;
}