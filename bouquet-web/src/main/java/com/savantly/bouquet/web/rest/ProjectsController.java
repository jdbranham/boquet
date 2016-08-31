package com.savantly.bouquet.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savantly.bouquet.data.entity.Project;

@RestController
@RequestMapping("/rest/project")
public class ProjectsController {

	@RequestMapping("/create")
	public Project create(){
		return new Project();
	}
}
