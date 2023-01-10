package com.groyyo.sfr.dto.reviewTemplate;

import com.groyyo.sfr.enumeration.ApprovalType;
import com.groyyo.sfr.enumeration.CommentType;
import com.groyyo.sfr.enumeration.LayoutType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LayoutResponse {
    private String name;
    private LayoutType layoutType;
    private CommentType commentType;
    private ApprovalType approvalType;
    private LayoutData layoutData;
}

