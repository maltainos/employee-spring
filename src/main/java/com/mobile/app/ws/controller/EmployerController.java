package com.mobile.app.ws.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.app.ws.service.impl.EmployerServiceResource;
import com.mobile.app.ws.shared.dto.EmployerDTO;
import com.mobile.app.ws.ui.request.EmployerDetailsRequestModel;
import com.mobile.app.ws.ui.response.EmployerRest;
import com.mobile.app.ws.ui.response.RequestOperationName;
import com.mobile.app.ws.ui.response.RequestStatusModel;

@RestController
@RequestMapping(path = "employers")
@CrossOrigin("http://localhost:4200")
public class EmployerController {
	
	@Autowired
	EmployerServiceResource employerService;
	
	@GetMapping
	public List<EmployerRest> getEmployers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "10")int limit){	
		
		List<EmployerDTO> employersDTO = employerService.getEmployers(page, limit);
		
		ModelMapper mapper = new ModelMapper();
		Type typeList = new TypeToken<List<EmployerRest>>() {}.getType();
		List<EmployerRest> returnValue = mapper.map(employersDTO, typeList);
		
		return returnValue;
	}
	
	@GetMapping(path = "/{employerId}")
	public List<EmployerRest> getEmployer(@PathVariable String employerId){
		return new ArrayList<EmployerRest>();
	}
	
	@PostMapping
	public EmployerRest createEmployer(@RequestBody EmployerDetailsRequestModel employerRequest) {
		
		ModelMapper mapper = new ModelMapper();
		EmployerDTO createValue = mapper.map(employerRequest, EmployerDTO.class);
		createValue = employerService.createEmployer(createValue);
		EmployerRest returnValue = mapper.map(createValue, EmployerRest.class);
		
		return returnValue;
	}
	
	@PutMapping(path = "/{employerId}")
	public EmployerRest updateEmployer(@RequestBody EmployerDetailsRequestModel employerRequest, 
			@PathVariable String employerId) {
		return new EmployerRest();
	}
	
	@PatchMapping(path = "/{employerId}/contact/{contactId}")
	public EmployerRest updateEmployer(@RequestBody EmployerDetailsRequestModel employerRequest,
			@PathVariable String employerId, @PathVariable String contactId) {
		return new EmployerRest();
	}
	
	@DeleteMapping(path = "/{employerId}")
	public RequestStatusModel deleteEmployer(@PathVariable String employerId) {
		
		RequestStatusModel requestStatus = new RequestStatusModel();
		requestStatus.setRequestOperationName(RequestOperationName.DELETE.getOperationName());
		
		requestStatus.setRequestOperationStatus(RequestOperationName.DELETE.getOperationName());
		return requestStatus;
	}

}








