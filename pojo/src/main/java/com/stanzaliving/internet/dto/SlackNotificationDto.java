package com.stanzaliving.internet.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlackNotificationDto<T> {

	private String slackUrl;

	private String channelName;

	private Date eventDate;

	private T data;

}
