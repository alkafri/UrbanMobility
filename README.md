# UrbanMobility Application

UrbanMobility is an application designed to streamline mobility in urban environments. It serves as a centralized platform for various transportation services in different cities.

## Continuous Integration Setup with Jenkins

This repository is configured for Continuous Integration (CI) using Jenkins. Two pipelines have been established to ensure the robustness and reliability of the application.

### Jenkins Pipelines

#### First Pipeline: Development Environment

1. **Source Code:**
   - Jenkins fetches the code from the GitHub repository.

2. **Test Execution:**
   - The pipeline runs tests against the development environment.
     - Unit tests: Validate individual components.
     - Smoke tests: Ensure basic functionality and communication between classes.
     - Integration tests: Confirm that information about authenticated users can be saved to the database.
     - End-to-end tests: Validate each endpoint's response as expected.

#### Second Pipeline: Production Environment

1. **Source Code:**
   - Jenkins fetches the code from the GitHub repository.

2. **Test Execution:**
   - The pipeline runs tests in the production environment (Ubuntu 22 or Alpine).
     - Unit tests: Ensure the correctness of individual components.
     - Smoke tests: Verify the basic functionality and communication between classes.
     - Integration tests: Confirm that information about authenticated users can be saved to the database.
     - End-to-end tests: Validate each endpoint's response as expected.

3. **Artifact Deployment:**
   - If all tests pass, the artifact is deployed using the Java runtime.

### System Requirements

To set up the CI environment and run the application, ensure the following:

- **Jenkins:**
  - Jenkins server configured to access this GitHub repository.

- **Docker or Ubuntu 22 (for production testing):**
  - The application must be runnable in a Linux environment.

## Running the Application Locally

To run the UrbanMobility application locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/alkafri/UrbanMobility

2. Navigate to the project directory:
    cd urban-mobility

3. Run the application:
    npm run start

The application should now be accessible at http://localhost:8080.

### Contributing
Feel free to contribute to the development of UrbanMobility. Create issues for bugs or feature requests, and submit pull requests to contribute code improvements.

### License
This project is licensed under the MIT License.