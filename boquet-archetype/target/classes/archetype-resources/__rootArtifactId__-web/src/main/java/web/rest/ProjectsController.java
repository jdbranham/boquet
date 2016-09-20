#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.data.entity.Project;

@RestController
@RequestMapping("/rest/project")
public class ProjectsController {

	@RequestMapping("/create")
	public Project create(){
		return new Project();
	}
}
