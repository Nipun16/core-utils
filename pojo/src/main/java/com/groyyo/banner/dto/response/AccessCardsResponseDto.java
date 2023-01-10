package com.groyyo.banner.dto.response;

import com.groyyo.community.enums.UserList;
import com.groyyo.genericdashboard.dto.AudienceLocationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessCardsResponseDto {

    private String uuid;
    private String cardName;
    private String imageUrl;
    private String actionUrl;
    private AudienceLocationDto audienceLocationDto;
    private Integer priority;
    private UserList userList;
    private Boolean status;
}
