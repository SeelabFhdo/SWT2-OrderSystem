package de.fhdo.swt.item.service;

import de.fhdo.swt.item.entity.Item;

public interface ItemService {
  public Item createItem(Item item);
  public Item updateItem(Item item);
  public Item readItem(String id);
  public void deleteItem(Item item);

}
