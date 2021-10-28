package com.mobile.app.ws.io.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mobile.app.ws.io.models.EmployerEntity;

@Repository
public interface EmployerRepository extends PagingAndSortingRepository<EmployerEntity, Long>{

}
