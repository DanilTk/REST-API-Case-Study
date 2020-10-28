package pl.dan.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.dan.demo.model.Animal;
import pl.dan.demo.model.Person;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {

    List<Animal> findByName(@Param("name") String name);

}
