package com.groyyo.website.request.dto;

import java.util.List;

import com.groyyo.core.user.acl.enums.Role;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class UserRoleDto {

    private Role role;
    private List<String> micromarketUuids;
}