# LoadBalancerTester

Welcome to LoadBalancerTester, a web application developed to test different load balancing algorithms. This tool provides information like the currently host and ip, it also has endpoints that generate resource consumption on the host and that can be stopped at any time, making it ideal for testing load balancers, autoscaling mechanisms, and Kubernetes replication.

## Features

- **Dynamic Display**: Easily view the IP and hostname where the application is currently running in real-time.
- **JSON Endpoint**: Access detailed deployment information in JSON format via the `/host` endpoint.
- **Resource Intensive Algorithm**: Initiate resource-intensive algorithms with a simple call to `/consume/start`.
- **Resource Management**: Stop resource consumption and algorithm execution promptly using the `/consume/stop` endpoint.

## Usage

- **View Deployment Info**: Visit the root endpoint to load the HTML page containing deployment information.
- **Access JSON Data**: Retrieve deployment details in JSON format by accessing the `/host` endpoint.
- **Start Resource Consumption**: Trigger resource-intensive algorithm execution by calling the `/consume/start` endpoint.
- **Stop Resource Consumption**: Halt resource consumption and algorithm execution using the `/consume/stop` endpoint.

## Technologies

- **Backend**: Developed using Java, Spring Boot, and Maven.
- **Frontend**: Utilizes Thymeleaf for seamless user interaction.
- **Deployment**: Easily deployable on various platforms like Docker or Kubernetes.

## How to Run

1. Clone the repository.
2. Install dependencies using Maven: `mvn install`.
3. Configure the application settings in `application.properties`.
4. Run the application on your preferred environment: `mvn spring-boot:run`.
