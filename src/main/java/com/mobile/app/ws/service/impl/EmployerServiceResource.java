package com.mobile.app.ws.service.impl;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mobile.app.ws.io.models.EmployerEntity;
import com.mobile.app.ws.io.repository.EmployerRepository;
import com.mobile.app.ws.service.EmployerService;
import com.mobile.app.ws.shared.GenerateID;
import com.mobile.app.ws.shared.dto.EmployerDTO;

@Service
public class EmployerServiceResource implements EmployerService{
	
	@Autowired
	EmployerRepository employerRepository;

	public List<EmployerDTO> getEmployers(int page, int limit) {
		
		if(page > 0) page = page - 1;
		
		Pageable pageable = PageRequest.of(page, limit);
		Page<EmployerEntity> employersPage = employerRepository.findAll(pageable);
		List<EmployerEntity> employers = employersPage.getContent();
		
		ModelMapper mapper = new ModelMapper();
		Type typeList = new TypeToken<List<EmployerDTO>>() {}.getType();
		List<EmployerDTO> returnValue = mapper.map(employers, typeList);
		
		return returnValue;
	}

	public EmployerDTO getEmployer(String employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployerDTO createEmployer(EmployerDTO employerDTO) {
		
		ModelMapper mapper = new ModelMapper();
		EmployerEntity employer = mapper.map(employerDTO, EmployerEntity.class);
		
		GenerateID employerManager = new GenerateID();
		employer.setEmployerId(employerManager.generateEmployerID(30));
		employer.setEmployerCode(employerManager.generateEmployerCODE(10));
		employer.setCreateOn(LocalDateTime.now());
		employer = employerRepository.save(employer);
		
		EmployerDTO returnValue = mapper.map(employer, EmployerDTO.class);
		
		return returnValue;
	}

	public EmployerDTO updateEmployer(EmployerDTO employerDTO, String employerId) {
		
		return null;
	}

	public EmployerDTO updateEmployer(EmployerDTO employerDTO, String employerId, String contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployer(String employerId) {
		// TODO Auto-generated method stub
		
	}
}
