# BecomeAQA
This  framework is designed in order to perform tests for GitHub using UI and API approaches


# Framework structure
## SRC - source files
### config module
all configurations, config values are stored in config file

### application module
Application specific components
Different for 
- UI (page locators, page actions, test data object generators)
- API (service APIs, service actions, Test data object generators)

### helpers
data providers, logger, file/time helpers, wrappers for allure, selenium

## TESTS
### tests
completely different place in the structure, different from source files. Testcases for 
- API
- UI

are stored here

