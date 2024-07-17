Sure, let's enhance the `about-controller.md` to include detailed descriptions, methods, and expected JSON outputs for each API endpoint in a clear format.

# API List:

## CarBrandController.java

<details>
  <summary>/api/car-brands</summary>
  **Description:** Get all the car brands.

  **Method:** GET

  **Controller Method:** `CarBrandController.getAllCarBrands()`

  **Expected JSON Output:**
  ```json
  [
    {
      "brandId": 1,
      "brandName": "Toyota"
    },
    {
      "brandId": 2,
      "brandName": "Ford"
    },
    {
      "brandId": 3,
      "brandName": "Hyundai"
    }
  ]
  ```
</details>

<details>
  <summary>/api/car-brands/{id}</summary>
  **Description:** Get a car brand by its ID.

  **Method:** GET

  **Controller Method:** `CarBrandController.getCarBrandById(Long id)`

  **Expected JSON Output:**
  ```json
  {
    "brandId": 1,
    "brandName": "Toyota"
  }
  ```
</details>

## CarModelController.java

<details>
  <summary>/api/car-models/brand/{brandId}</summary>
  **Description:** Get all car models based on the car brand's brand_id.

  **Method:** GET

  **Controller Method:** `CarModelController.getCarModelsByBrandId(Long brandId)`

  **Expected JSON Output:**
  ```json
  [
    {
      "modelId": 1,
      "modelName": "Corolla",
      "carBrand": {
        "brandId": 1,
        "brandName": "Toyota"
      }
    },
    {
      "modelId": 2,
      "modelName": "Camry",
      "carBrand": {
        "brandId": 1,
        "brandName": "Toyota"
      }
    }
  ]
  ```
</details>

<details>
  <summary>/api/car-models/{modelId}</summary>
  **Description:** Get car brand and car model based on model_id.

  **Method:** GET

  **Controller Method:** `CarModelController.getCarModelById(Long modelId)`

  **Expected JSON Output:**
  ```json
  {
    "modelId": 1,
    "modelName": "Corolla",
    "carBrand": {
      "brandId": 1,
      "brandName": "Toyota"
    }
  }
  ```
</details>

<details>
  <summary>/api/car-models/{modelId}/brand</summary>
  **Description:** Get the car brand from the car model's model_id.

  **Method:** GET

  **Controller Method:** `CarModelController.getCarBrandByModelId(Long modelId)`

  **Expected JSON Output:**
  ```json
  {
    "brandId": 1,
    "brandName": "Toyota"
  }
  ```
</details>

## FleetCarController.java

<details>
  <summary>/api/fleet-cars</summary>
  **Description:** Get all fleet cars ordered by expiry date.

  **Method:** GET

  **Controller Method:** `FleetCarController.getAllFleetCars()`

  **Expected JSON Output:**
  ```json
  [
    {
      "fleetCarId": 1,
      "numberPlate": "ABC123",
      "expiryDate": "2024-07-01",
      "carModel": {
        "modelId": 1,
        "modelName": "Corolla",
        "carBrand": {
          "brandId": 1,
          "brandName": "Toyota"
        }
      },
      "driverName": "John Doe",
      "fleetActive": true
    },
    {
      "fleetCarId": 2,
      "numberPlate": "XYZ789",
      "expiryDate": "2024-08-01",
      "carModel": {
        "modelId": 2,
        "modelName": "Camry",
        "carBrand": {
          "brandId": 1,
          "brandName": "Toyota"
        }
      },
      "driverName": "Jane Smith",
      "fleetActive": true
    }
  ]
  ```
</details>

<details>
  <summary>/api/fleet-cars/active</summary>
  **Description:** Get all active fleet cars.

  **Method:** GET

  **Controller Method:** `FleetCarController.getActiveFleetCars()`

  **Expected JSON Output:**
  ```json
  [
    {
      "fleetCarId": 1,
      "numberPlate": "ABC123",
      "expiryDate": "2024-07-01",
      "carModel": {
        "modelId": 1,
        "modelName": "Corolla",
        "carBrand": {
          "brandId": 1,
          "brandName": "Toyota"
        }
      },
      "driverName": "John Doe",
      "fleetActive": true
    }
  ]
  ```
</details>

<details>
  <summary>/api/fleet-cars/inactive</summary>
  **Description:** Get all inactive fleet cars.

  **Method:** GET

  **Controller Method:** `FleetCarController.getInactiveFleetCars()`

  **Expected JSON Output:**
  ```json
  [
    {
      "fleetCarId": 2,
      "numberPlate": "XYZ789",
      "expiryDate": "2023-05-01",
      "carModel": {
        "modelId": 2,
        "modelName": "Camry",
        "carBrand": {
          "brandId": 1,
          "brandName": "Toyota"
        }
      },
      "driverName": "Jane Smith",
      "fleetActive": false
    }
  ]
  ```
</details>

<details>
  <summary>/api/fleet-cars/{id}</summary>
  **Description:** Update the fleet_active status of a fleet car by its ID.

  **Method:** PUT

  **Controller Method:** `FleetCarController.updateFleetCarActiveStatus(Long id, boolean activeStatus)`

  **Expected JSON Output:**
  ```json
  {
    "fleetCarId": 1,
    "numberPlate": "ABC123",
    "expiryDate": "2024-07-01",
    "carModel": {
      "modelId": 1,
      "modelName": "Corolla",
      "carBrand": {
        "brandId": 1,
        "brandName": "Toyota"
      }
    },
    "driverName": "John Doe",
    "fleetActive": true
  }
  ```
</details>

<details>
  <summary>/api/fleet-cars</summary>
  **Description:** Create a new fleet car entry.

  **Method:** POST

  **Controller Method:** `FleetCarController.createFleetCar(FleetCar fleetCar)`

  **Expected JSON Input:**
  ```json
  {
    "numberPlate": "ABC123",
    "expiryDate": "2024-07-01",
    "carModel": {
      "modelId": 1
    },
    "driverName": "John Doe",
    "fleetActive": true
  }
  ```

  **Expected JSON Output:**
  ```json
  {
    "fleetCarId": 1,
    "numberPlate": "ABC123",
    "expiryDate": "2024-07-01",
    "carModel": {
      "modelId": 1,
      "modelName": "Corolla",
      "carBrand": {
        "brandId": 1,
        "brandName": "Toyota"
      }
    },
    "driverName": "John Doe",
    "fleetActive": true
  }
  ```
</details>