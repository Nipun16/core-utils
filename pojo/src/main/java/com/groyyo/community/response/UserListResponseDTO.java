package com.groyyo.community.response;

import com.groyyo.community.enums.UserList;
import com.groyyo.community.request.EventLocationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserListResponseDTO {
    private Long id;
    private String uuid;

    private UserList userListType;

    private EventLocationDTO specificLocation;

    private String userListCsvUrl;
}
