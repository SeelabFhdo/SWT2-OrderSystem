package de.fhdo.swt.location.service;

import de.fhdo.swt.location.entity.Location;

public interface LocationService {
  public Location createLocation(Location location);
  public Location updateLocation(Location location);
  public Location readLocation(String id);
  public void deleteLocation(Location location);
}
