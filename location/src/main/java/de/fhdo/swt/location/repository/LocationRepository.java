package de.fhdo.swt.location.repository;

import de.fhdo.swt.location.entity.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, String> {

}
