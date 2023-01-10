/**
 * 
 */
package com.groyyo.taskservice.response.dto;

import java.util.Date;

import com.groyyo.taskservice.enums.TaskContextName;
import com.groyyo.taskservice.enums.TaskType;

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
public class TaskResponseDto {

	private String contextUuid;
	private TaskContextName taskContextName;
	private String statusName;
	private String userUuid;
	private String taskUuid;
	private TaskType taskType;
	private String role;
	private Date taskCreationDate;
}
