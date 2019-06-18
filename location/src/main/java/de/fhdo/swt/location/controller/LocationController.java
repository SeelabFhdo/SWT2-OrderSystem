package de.fhdo.swt.location.controller;

import de.fhdo.swt.location.entity.Location;
import de.fhdo.swt.location.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources/v1/locationinterface", produces = "application/json")
public class LocationController {
  private LocationService locationService;
  private static final Logger LOGGER = LoggerFactory.getLogger(LocationController.class);

  @Autowired
  public void setLocationService(LocationService locationService) {
    this.locationService = locationService;
  }

  @GetMapping(value = "/location/id/{id}")
  public Location readLocation(@PathVariable String id){
    LOGGER.info("Readlocation");
    return locationService.readLocation(id);
  }

  @PutMapping(value = "/")
  public Location createLocation(@RequestBody Location location){
    return locationService.createLocation(location);
  }

  @PostMapping(value = "/")
  public Location updateLocation(@RequestBody Location location){
    return locationService.updateLocation(location);
  }

  @DeleteMapping(value = "/")
  public void deleteLocation(@RequestBody Location location){
    locationService.deleteLocation(location);
  }
}
