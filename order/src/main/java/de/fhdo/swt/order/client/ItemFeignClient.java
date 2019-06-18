package de.fhdo.swt.order.client;

import de.fhdo.swt.order.entity.shared.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("itemservice")
public interface ItemFeignClient {
  @GetMapping(value = "/resources/v1/iteminterface/item/id/{id}")
  public Item readItem(@PathVariable String id);

}
