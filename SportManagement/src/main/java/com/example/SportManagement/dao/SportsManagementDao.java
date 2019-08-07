package com.example.SportManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.SportManagement.bean.Sports;

public interface SportsManagementDao extends CrudRepository<Sports, Integer>{

	
}
