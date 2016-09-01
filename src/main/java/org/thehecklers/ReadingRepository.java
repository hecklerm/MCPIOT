package org.thehecklers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Mark Heckler (mark.heckler@gmail.com, @mkheck)
 */
@RepositoryRestResource
public interface ReadingRepository extends CrudRepository<Reading, Integer> {
}
