package com.stanzaliving.sfr.dto.propertyOnboarding;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyMigrationDto extends AbstractMongoDto {
    @EmptyOrNull(message = "Property Id cannot be empty or null")
    private String propertyUuid;
    @EmptyOrNull(message = "Question Id cannot be empty or null")
    private String questionUuid;
    @EmptyOrNull(message = "Variable Name cannot be empty or null")
    private String variableName;
    private List<String> answers;
    private List<String> imageUrls;
    @NotNull(message = "Remarks cannot be null")
    private String remarks;
    @NotNull(message="submissionId cannot be null")
    private Long moduleSubmissionId;
}