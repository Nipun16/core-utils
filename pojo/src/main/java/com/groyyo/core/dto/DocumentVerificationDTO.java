package com.groyyo.core.dto;


import com.groyyo.core.enums.DocumentVerificationSource;
import com.groyyo.core.enums.VerificationStatus;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentVerificationDTO {

    @NotNull Boolean verified;

    private String documentUuid;

    private DocumentVerificationSource verificationSource;

    private String requestId;

    private String payload;

    private String response;

    private List<DocumentFieldVerificationDTO> verifications;

    private VerificationStatus verificationStatus;
}