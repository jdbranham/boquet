package com.savantly.bouquet.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.savantly.bouquet.data.entity.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project, String> {

	public Project findFirstByName(String name);
}
