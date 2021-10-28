package com.mobile.app.ws.service;

import java.util.List;

import com.mobile.app.ws.shared.dto.EmployerDTO;

public interface EmployerService {
	
	List<EmployerDTO> getEmployers(int page, int limit);
	EmployerDTO getEmployer(String employerId);
	EmployerDTO createEmployer(EmployerDTO employerDTO);
	EmployerDTO updateEmployer(EmployerDTO employerDTO, String employerId);
	EmployerDTO updateEmployer(EmployerDTO employerDTO, String employerId, String contactId);
	void deleteEmployer(String employerId);

}
