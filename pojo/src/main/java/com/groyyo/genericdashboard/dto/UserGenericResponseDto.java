package com.groyyo.genericdashboard.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.groyyo.genericdashboard.enums.ResponseType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserGenericResponseDto {

	@NotNull
    @NotBlank
    private String userId;

    @NotNull
    private UserSurveyResponseDto surveyResponseDto;
    
    @NotNull
    private ResponseType responseType;

    private Date responseTimeStamp;
	
}
