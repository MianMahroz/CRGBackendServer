package com.bestercapitalmedia.chiragh.CRGBackendServer;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.Trigger;

import com.bestercapitalmedia.chiragh.utill.ChiragUtill;

@SpringBootApplication(scanBasePackages = { "com.bestercapitalmedia" })
@EnableJpaRepositories("com.bestercapitalmedia")
@EntityScan("com.bestercapitalmedia")
@PropertySource(value = { "classpath:application.properties" })
public class CrgBackendServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrgBackendServerApplication.class, args);
	}
	
//	@Bean
//	public JobDetail sampleJobDetail() {
//		return JobBuilder.newJob(SampleJob.class).withIdentity("sampleJob").usingJobData("name", "World").storeDurably()
//				.build();
//	}
//
//	@Bean
//	public SimpleTrigger sampleJobTrigger() {
//		SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2)
//				.repeatForever();
//		return TriggerBuilder.newTrigger().forJob(sampleJobDetail()).withIdentity("sampleTrigger")
//				.withSchedule(scheduleBuilder).build();
//
//	}
}
