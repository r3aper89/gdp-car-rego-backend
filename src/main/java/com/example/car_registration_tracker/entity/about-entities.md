## Database Schema

The database schema consists of the following tables:

1. **car_brands**: Stores information about car brands.
2. **car_models**: Stores information about car models associated with specific brands.
3. **fleet_cars**: Stores information associated with cars, including but not limited to the active status of a car.

### Tables

#### car_brands

| Column     | Type    | Constraints      |
| ---------- | ------- | ---------------- |
| brand_id   | SERIAL  | PRIMARY KEY      |
| brand_name | VARCHAR | NOT NULL, UNIQUE |

#### car_models

| Column     | Type    | Constraints                        |
| ---------- | ------- | ---------------------------------- |
| model_id   | SERIAL  | PRIMARY KEY                        |
| model_name | VARCHAR | NOT NULL                           |
| brand_id   | INT     | NOT NULL, FOREIGN KEY (car_brands) |

#### fleet_cars

| Column       | Type    | Constraints                        |
| ------------ | ------- | ---------------------------------- |
| fleet_car_id | SERIAL  | PRIMARY KEY                        |
| number_plate | VARCHAR | NOT NULL, UNIQUE                   |
| expiry_date  | DATE    | NOT NULL                           |
| model_id     | INT     | NOT NULL, FOREIGN KEY (car_models) |
| driver_name  | VARCHAR | NOT NULL                           |
| fleet_active | BOOLEAN | DEFAULT TRUE                       |
