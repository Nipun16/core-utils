package com.groyyo.support.dto;

import com.groyyo.core.utilservice.annotations.EnsureNumber;
import com.groyyo.support.enums.RelationType;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResidentRelationDto {
    @NotBlank(message = "User Id is Required")
    private String userId;

    @NotBlank(message = "Mobile Number is Required")
    @EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobileNumber")
    private String mobileNumber;

    @NotBlank(message = "Full Name is Required")
    private String fullName;

    @NotBlank(message = "Email is Required")
    @Email(message = "You’ve entered an incorrect email format. Please try again!")
    private String email;

    @NotBlank(message = "RelationType is Required")
    private RelationType relationType;

}
