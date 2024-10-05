# Cucumber Selenium Test Automation with Test Case Distribution on Multiple VMs

This project is a test automation framework built using **Cucumber** and **Selenium** for web application testing. It allows for parallel execution of feature files on multiple virtual machines (VMs) to enhance testing efficiency.

## Features

- **Parallel Execution**: Run multiple feature files simultaneously across different VMs.
- **Cucumber Integration**: Use Gherkin syntax for writing test cases.
- **Allure Reporting**: Generate detailed reports using Allure.
- **Configurable Browser**: Easily switch between different browsers.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java JDK 8 or higher
- Maven 3.x
- Selenium Server installed on each VM
- ChromeDriver (if using Chrome) installed on each VM
- An IDE (like IntelliJ IDEA or Eclipse) for development

## Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/your-repo.git
   cd your-repo


2. **Build the Project**

   Run the following command to build the project:

   ```bash
   mvn clean install
   ```

3. **Set Up Selenium Grid Manually**

   - Install **Selenium Server** on each VM you intend to use. You can download it from the [Selenium downloads page](https://www.selenium.dev/downloads/).
   - Start the Selenium Server on the designated VMs by running the following command in the terminal of each VM:

     ```bash
     java -jar selenium-server-standalone-x.xx.x.jar
     ```

   - Replace `x.xx.x` with the version number of the Selenium Server you downloaded.

4. **Configure `global.properties`**

   Edit the `src/main/resources/config/global.properties` file to set your desired browser and base URL:

   ```properties
   browser=chrome
   url=https://example.com
   ```

## Running Tests

To run the tests, you can use the following command:

```bash
mvn test
```

### Test Case Distribution

In the `TestRunner` class, the tests are distributed across multiple VMs. Each feature file is mapped to a specific VM IP address. For example:

```java
return new Object[][]{
    {"src/test/resources/features/feature1.feature", "149.112.32.198"}, // Feature 1 on VM 1
    {"src/test/resources/features/feature2.feature", "149.112.32.199"}, // Feature 2 on VM 2
    {"src/test/resources/features/feature3.feature", "149.112.32.200"}  // Feature 3 on VM 3
};
```

This allows each feature file to run independently on the assigned VM, enabling efficient use of resources and faster test execution.

## Reporting

After the test execution, the reports will be generated in the `reports` directory. You can view the results in HTML format or use Allure to generate more detailed reports.

To generate Allure reports, ensure you have Allure installed and run:

```bash
allure serve target/cucumber-reports
```

## Contributing

If you want to contribute to this project, please fork the repository and create a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Cucumber](https://cucumber.io/)
- [Selenium](https://www.selenium.dev/)
- [Allure](https://docs.qameta.io/allure/)
- [TestNG](https://testng.org/doc/index.html)
```
