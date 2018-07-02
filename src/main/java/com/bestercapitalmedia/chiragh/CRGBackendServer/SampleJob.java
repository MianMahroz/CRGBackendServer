package com.bestercapitalmedia.chiragh.CRGBackendServer;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

// TODO: Auto-generated Javadoc
/**
 * The Class SampleJob.
 */
public class SampleJob extends QuartzJobBean {

	/** The name. */
	private String name;

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	// Invoked if a Job data map entry with that name
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
	 */
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println(String.format("Hello %s!", this.name));
	}

}