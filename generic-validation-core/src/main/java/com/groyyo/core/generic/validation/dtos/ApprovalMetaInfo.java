package com.groyyo.core.generic.validation.dtos;

import com.groyyo.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApprovalMetaInfo {
    @NotNull
    private Integer approvalLevels;
    @NotNull
    private List<Department> approvalDepts;
}
