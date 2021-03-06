/*
 * 
 */
package com.bestercapitalmedia.chiragh.CRGBackendServer;

import java.util.Collections;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.Trigger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.bestercapitalmedia.chiragh.utill.ChiragUtill;

// TODO: Auto-generated Javadoc
/**
 * The Class CrgBackendServerApplication.
 */
//@CrossOrigin(origins= {"http://localhost:4200","http://demo.chiragh.com"})
@SpringBootApplication(scanBasePackages = { "com.bestercapitalmedia" })
@EnableJpaRepositories("com.bestercapitalmedia")
@EntityScan("com.bestercapitalmedia")
@PropertySource(value = { "classpath:application.properties" })
public class CrgBackendServerApplication extends SpringBootServletInitializer {
	
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.web.servlet.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(CrgBackendServerApplication.class);
	    }

	    /**
    	 * The main method.
    	 *
    	 * @param args the arguments
    	 * @throws Exception the exception
    	 */
    	public static void main(String[] args) throws Exception {
	        SpringApplication.run(CrgBackendServerApplication.class, args);
	    }

//	public static void main(String[] args) {
//		SpringApplication.run(CrgBackendServerApplication.class, args);
/**
 * Simple cors filter.
 *
 * @return the filter registration bean
 */
//	}
	@Bean
	public FilterRegistrationBean simpleCorsFilter() {
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true);
//	    config.setAllowedOrigins(Collections.singletonList("*"));
	    config.setAllowedOrigins(Collections.singletonList("*"));

	    
	    config.setAllowedMethods(Collections.singletonList("*"));
	    config.setAllowedHeaders(Collections.singletonList("*"));
	    source.registerCorsConfiguration("/**", config);
	    FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    return bean;
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
