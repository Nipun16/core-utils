package com.groyyo.designservice.response.dto;

import com.groyyo.designservice.enums.PhoenixDesignStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PhoenixDesignStatusCountDto {

    private PhoenixDesignStatus status;

    private String name;

    private Integer count;

    private double percentage;

    private String color;

}
