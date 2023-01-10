/**
 * 
 */
package com.groyyo.pushnotification.pojo;

import com.groyyo.pushnotification.enums.PushNotificationType;
import com.groyyo.pushnotification.enums.ServiceName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PushNotificationRequestDto {

	private String estateUuid;
	private String notificationTitle;
	private String notificationMessage;
	private ServiceName serviceName;
	private PushNotificationType pushNotificationType;
	private String userUuid;
	
}
