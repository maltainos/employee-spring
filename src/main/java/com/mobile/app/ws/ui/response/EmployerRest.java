package com.mobile.app.ws.ui.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployerRest {
	
	private String EmployerId;
	private String firstName;
	private String lastName;
	private String email;
	private String jobTitle;
	private String imageUrl;
	private String employerCode;
	private List<PhoneRest> phones;
	private LocalDateTime createOn;
	private LocalDateTime updateOn;
}
