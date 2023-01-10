package com.groyyo.core.bookingservice.dto.request;

import com.groyyo.core.bookingservice.dto.PhoneNumberDto;
import com.groyyo.core.utilservice.annotations.Email;
import com.groyyo.core.utilservice.annotations.IsStringOnlyAlphabet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetailRequestDto {

    @IsStringOnlyAlphabet (message = "Invalid First Name")
    private String firstName;

    @IsStringOnlyAlphabet (message = "Invalid Last Name")
    private String lastName;

    @Valid
    private PhoneNumberDto mobile;

    @NotBlank(message = "Email is mandatory to add new user")
    @Email
    private String email;

}
