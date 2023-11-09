# BecomeAQA
This  framework is designed in order to perform tests for GitHub using UI and API approaches


# Framework structure
## SRC - source files


### main/java is application module
Application specific components
Different for 
- UI_testing (page locators, page actions, test data object generators e.g. LoginPagePOM)
- API_testing (service APIs, service actions, Test data object generators)
  - GitHubAPICLient - created for API testing (https://docs.github.com/en/rest/search/search?apiVersion=2022-11-28#search-repositories)

#### helpers
data providers, logger, file/time helpers, wrappers for allure, selenium

#### config
- ConfigReader to test the reading of resources

### main/resources 
is a config module where all configurations/config values are stored
-config.properties


## TESTS
completely different place in the structure, different from source files.
### tests/github
Testcases for 
- API
    - HTTPrequests
      - BasicAPITest - the basic set of tests
      - BeforeAfterClasses - same parts of code that will be called in each test of BasicAPITest
      - Verify - verify method for total-numbers
    - TestConfigValues - test to read the values from resources

- UI
  - BasicUITest - Basic test contains @BeforeTest, @AfterTest methods
  - TestSeleniumGitHubLoginPage - test without using POM
  - TestSeleniumGitHubLoginPageWithPOM - same tests as above but with POM used

are stored here

