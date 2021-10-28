package com.mobile.app.ws.shared.dto;

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
public class EmployerDTO {
	
	private Long id;
	private String EmployerId;
	private String firstName;
	private String lastName;
	private String email;
	private String jobTitle;
	private String imageUrl;
	private String employerCode;
	private List<PhoneDTO> phones;
	private LocalDateTime createOn;
	private LocalDateTime updateOn;
}





