package de.fhdo.swt.item.repository;

import de.fhdo.swt.item.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, String> {

}
