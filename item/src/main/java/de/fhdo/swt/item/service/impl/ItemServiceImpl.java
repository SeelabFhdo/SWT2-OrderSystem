package de.fhdo.swt.item.service.impl;

import de.fhdo.swt.item.entity.Item;
import de.fhdo.swt.item.repository.ItemRepository;
import de.fhdo.swt.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
  private ItemRepository itemRepository;

  @Autowired
  public void setItemRepository(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  @Override
  public Item createItem(Item item){
    return itemRepository.save(item);
  }

  @Override
  public Item updateItem(Item item) {
    return itemRepository.save(item);
  }

  @Override
  public Item readItem(String id){
    return itemRepository.findById(id).orElseGet(null);
  }

  @Override
  public void deleteItem(Item item) {
    itemRepository.delete(item);
  }

}
