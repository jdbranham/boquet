package it.pkg.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.pkg.data.entity.Project;

@RestController
@RequestMapping("/rest/project")
public class ProjectsController {

	@RequestMapping("/create")
	public Project create(){
		return new Project();
	}
}
