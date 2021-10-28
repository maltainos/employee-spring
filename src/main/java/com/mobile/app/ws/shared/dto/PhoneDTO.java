package com.mobile.app.ws.shared.dto;

import com.mobile.app.ws.io.models.EmployerEntity;

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
public class PhoneDTO {

	private Long id;
	private String phoneId;
	private String phoneNumber;
	private EmployerEntity employerDetails;
}
