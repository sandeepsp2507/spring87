package com.example.SportManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SportManagement.bean.Register;
import com.example.SportManagement.bean.Sports;
import com.example.SportManagement.dao.RegisterDao;
import com.example.SportManagement.dao.SportsManagementDao;


@RestController
@RequestMapping("/sports")
public class SportsManagementController {
	
	@Autowired
	private SportsManagementDao dao;
	
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Sports> getSports(){
		System.out.println("REceived request");
		return (List<Sports>) dao.findAll();
	}
	
	
	@Autowired
	private RegisterDao dao1;
	
	@PostMapping("/register")
	@CrossOrigin(origins = "http://localhost:4200")
	public Register postRegister(@RequestBody Register reg){
		System.out.println("Registered");
		CrudRepository<Register, String> repository = null;
		Register reg1=repository.save(new Register(reg.getTeamname(),reg.getEmail(),
				reg.getMobilenumber()));
		return reg1;
	}
	
	

	
	
	
}


