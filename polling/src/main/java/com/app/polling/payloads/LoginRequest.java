package com.app.polling.payloads;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

	@NotBlank
	private String userNameOrEmail;
	
	@NotBlank
	private String password;
	
}
