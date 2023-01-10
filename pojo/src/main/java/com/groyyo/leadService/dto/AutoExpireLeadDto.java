package com.groyyo.leadService.dto;

import com.groyyo.core.leaddashboard.enums.LeadStatus;
import com.groyyo.core.leaddashboard.enums.LeadSubStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AutoExpireLeadDto {

    private Long id;
    private String uuid;
    private String phone;
    private String cityUuid;
    private String micromarketUuid;
    private String residenceUuid;
    private Date updatedAt;
    private LeadStatus leadStatus;
    private LeadSubStatus leadSubStatus;
}
