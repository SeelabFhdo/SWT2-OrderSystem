package de.fhdo.swt.item.controller;

import de.fhdo.swt.item.entity.Item;
import de.fhdo.swt.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources/v1/iteminterface", produces = "application/json")
public class ItemController {
  private ItemService itemService;

  @Autowired
  public void setItemService(ItemService itemService) {
    this.itemService = itemService;
  }

  @PutMapping(value = "/")
  public Item createItem(@RequestBody Item item) {
    return itemService.createItem(item);
  }

  @PostMapping(value = "/")
  public Item updateItem(@RequestBody Item item) {
    return itemService.updateItem(item);
  }

  @GetMapping(value = "/item/id/{id}")
  public Item readItem(@PathVariable String id) {
    return itemService.readItem(id);
  }
}
