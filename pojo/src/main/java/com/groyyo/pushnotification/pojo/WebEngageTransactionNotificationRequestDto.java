package com.groyyo.pushnotification.pojo;

import lombok.*;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class WebEngageTransactionNotificationRequestDto {
    private String accountId;       //not required if absolute url is given in GroyyoRestClient
    private String campaignId;      //not required if absolute url is given in GroyyoRestClient
    private String userId;
    private Map<String, String> overrideData;
    private Integer ttl;
}
