package it.pkg.data.repository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.pkg.data.entity.Project;
import it.pkg.data.repository.ProjectRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProjectRepositoryTest {
	
	@Autowired
    private EntityManager entityManager;

    @Autowired
    private ProjectRepository repository;

	@Test
	public void test() {
		Project expected = new Project();
		String name = "testProject";
		expected.setName(name);
		this.entityManager.persist(expected);
		Project actual = this.repository.findFirstByName(name);
		assertThat(actual).hasFieldOrPropertyWithValue("name", expected.getName());
	}

}
