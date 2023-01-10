package com.groyyo.core.user.acl.request.dto;

import com.groyyo.core.base.enums.Department;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckRoleNamesDto {

    @NotNull
    private Department department;

    @NotEmpty
    private List<String> roleNames;

}
