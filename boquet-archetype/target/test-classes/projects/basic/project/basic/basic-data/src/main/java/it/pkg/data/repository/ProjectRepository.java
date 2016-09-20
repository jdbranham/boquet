package it.pkg.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import it.pkg.data.entity.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project, String> {

	public Project findFirstByName(String name);
}
