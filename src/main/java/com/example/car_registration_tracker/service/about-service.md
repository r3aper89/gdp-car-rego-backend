
```java
    // change to active non active 
    public FleetCar updateFleetCarActiveStatus(Long id, boolean activeStatus) {
        FleetCar fleetCar = fleetCarRepository.findById(id).orElse(null);
        if (fleetCar != null) {
            fleetCar.setFleetActive(activeStatus);
            return fleetCarRepository.save(fleetCar);
        }
        return null;
    }
```