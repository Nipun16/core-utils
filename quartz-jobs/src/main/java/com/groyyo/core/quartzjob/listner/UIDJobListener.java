package com.groyyo.core.quartzjob.listner;

import com.groyyo.core.base.GroyyoConstants;
import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.slf4j.MDC;

import java.util.Objects;
import java.util.UUID;

/**
 * @author nipunaggarwal 
 *
 * @version 1.0
 *
 * @since 18-Apr-2021
 */

@Log4j2
public class UIDJobListener implements JobListener {
	private static final String LISTENER_NAME = "UUID Listener";

	@Override
	public String getName() {
		return LISTENER_NAME;
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {

		String guid = UUID.randomUUID().toString().replace("-", "");
		String luid = UUID.randomUUID().toString().replace("-", "");

		MDC.put(GroyyoConstants.GUID, guid);
		MDC.put(GroyyoConstants.LUID, luid);

		String jobName = context.getJobDetail().getKey().toString();
		log.info("Running Job: {}", jobName);
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {

		String jobName = context.getJobDetail().getKey().toString();
		log.info("Job Vetoed: {}", jobName);

		MDC.remove(GroyyoConstants.GUID);
		MDC.remove(GroyyoConstants.LUID);

	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {

		String jobName = context.getJobDetail().getKey().toString();
		log.info("Job executed: {}", jobName);

		if (Objects.nonNull(jobException)) {
			log.error("Error while running job. ", jobException);
		}

		MDC.remove(GroyyoConstants.GUID);
		MDC.remove(GroyyoConstants.LUID);
	}

}


