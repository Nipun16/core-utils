/**
 * 
 */
package com.groyyo.taskservice.request.dto;

import com.groyyo.taskservice.enums.TaskContextName;
import com.groyyo.taskservice.enums.TaskType;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class TaskRequestDto {

	private String contextUuid;
	private TaskContextName taskContextName;
	private String statusName;
	private String userUuid;
	private TaskType taskType;
	private String role;
	
}
