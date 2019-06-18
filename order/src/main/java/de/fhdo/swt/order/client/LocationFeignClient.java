package de.fhdo.swt.order.client;

import de.fhdo.swt.order.entity.shared.Location;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("locationservice")
public interface LocationFeignClient {
  @GetMapping(value = "/resources/v1/locationinterface/location/id/{id}")
  public Location readLocation(@PathVariable String id);
}
