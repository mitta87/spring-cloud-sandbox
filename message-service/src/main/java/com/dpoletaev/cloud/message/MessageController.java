package com.dpoletaev.cloud.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
@RefreshScope
public class MessageController {

	@Value("${message.text}")
	private String text;

	@GetMapping
	public String getMessage() {
		return text;
	}
}
