#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import ${package}.data.entity.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project, String> {

	public Project findFirstByName(String name);
}
