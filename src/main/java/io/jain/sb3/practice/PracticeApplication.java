package io.jain.sb3.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import io.jain.sb3.practice.beans.GreetingBean;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring.");
		ConfigurableApplicationContext ctx =  SpringApplication.run(PracticeApplication.class, args);
		// just to test commit.
		GreetingBean gBean = (GreetingBean)ctx.getBean(GreetingBean.class);
		System.out.println(gBean.getGreetingMessage() + " world!");
	}

}
