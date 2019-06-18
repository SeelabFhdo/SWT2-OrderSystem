package de.fhdo.swt.location.service.impl;

import de.fhdo.swt.location.entity.Location;
import de.fhdo.swt.location.repository.LocationRepository;
import de.fhdo.swt.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
  private LocationRepository locationRepository;

  @Autowired
  public void setLocationRepository(LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
  }

  public Location createLocation(Location location) {
    return locationRepository.save(location);
  }

  public Location updateLocation(Location location) {
    return locationRepository.save(location);
  }

  public Location readLocation(String id) {
    return locationRepository.findById(id).orElseGet(null);
  }

  public void deleteLocation(Location location) {
    locationRepository.delete(location);
  }
}
