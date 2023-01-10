package com.groyyo.core.dto;

import com.groyyo.core.dto.DocumentFieldVerificationDTO;
import com.groyyo.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationResponseDTO {
    private List<DocumentFieldVerificationDTO> verifications;

    private VerificationStatus verificationStatus;

    private String message;
}
