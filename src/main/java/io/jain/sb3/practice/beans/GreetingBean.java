package io.jain.sb3.practice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingBean {
    
	@Value("${greeting.message}")
	//@DefaultValue("Hey!")
	private String greetingMessage;

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}
	
	
}
