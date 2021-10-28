package com.mobile.app.ws.ui.request;

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
public class EmployerDetailsRequestModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String jobTitle;
	private String imageUrl;
	private List<PhoneRequestDetailsModel> phones;
}








