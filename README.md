# Java Basics & Logic Debugging Assessment

A two-part assessment project designed to test foundational Java programming principles. The exercises focus on data types, conditional control loops, modulo arithmetic, array collection filtration, and debugging algorithmic logic.

This repository utilizes **Maven** for build automation and management, along with **JUnit 5** to handle unit testing validation.

---

## 📂 Project Directory Layout

Maven expects a highly strict architecture structure. Ensure your project workspace matches the directory map layout below:

```text
java-basics-assessment/
├── pom.xml                                   # Project metadata and dependencies
├── README.md                                 # Documentation and terminal guide
└── src/
    ├── main/java/
    │   ├── JavaAssessment.java               # Part 1 logic implementation source
    │   └── JavaAssessmentPart2.java          # Part 2 exercises source skeleton
    └── test/java/
        ├── JavaAssessmentTest.java           # Unit assertions for Part 1
        └── JavaAssessmentPart2Test.java      # Unit assertions for Part 2

🛠️ Essential Build Commands

Run these core lifecycle commands from your terminal at the project root directory:
Compile the Code Base

Validates your syntax structure across all source files and catches compile-time type mismatches:
Bash

mvn compile

Clean the Target Environment

Clears compiled .class binary artifacts and resets the target workspace cache before starting a fresh run:
Bash

mvn clean

🚦 How to Run the Unit Test Suites

Maven allows you to execute the entire testing harness at once, isolate a single test file, or pinpoint an individual question method using the -Dtest= runtime flag.
1. Run All Project Tests Simultaneously

Executes every test case inside both JavaAssessmentTest and JavaAssessmentPart2Test:
Bash

mvn test

2. Isolate Testing to a Specific File Part

If you only want to focus on checking the methods belonging to a specific assessment file:

    Run Part 1 tests only:
    Bash

    mvn test -Dtest=JavaAssessmentTest

    Run Part 2 tests only:
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test

3. Run a Targeted Method Test Case

To speed up your debugging flow, you can test a single question method at a time without running anything else by passing the ClassName#methodName syntax pattern:
Part 1 targeted test methods:

    Test Question 1 (fizzBuzzSa):
    Bash

    mvn test -Dtest=JavaAssessmentTest#testFizzBuzzSa

    Test Question 2 (loadSheddingSchedule):
    Bash

    mvn test -Dtest=JavaAssessmentTest#testLoadSheddingSchedule

    Test Question 3 (computeFare):
    Bash

    mvn test -Dtest=JavaAssessmentTest#testComputeFare

    Test Question 4 (atmWithdrawal):
    Bash

    mvn test -Dtest=JavaAssessmentTest#testAtmWithdrawal

    Test Question 5 (checkStudentPass):
    Bash

    mvn test -Dtest=JavaAssessmentTest#testCheckStudentPass

Part 2 targeted test methods:

    Test Q1.1 Easy (getCardType):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testGetCardType

    Test Q1.2 Medium (verifySADocuments):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testVerifySADocuments

    Test Q1.3 Hard (validateSaId):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testValidateSaId

    Test Q2.1 Easy (countTaxYears):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testCountTaxYears

    Test Q2.2 Medium (taxiRankDispatcher):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testTaxiRankDispatcher

    Test Q2.3 Hard (luhnChecksumBasic):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testLuhnChecksumBasic

    Test Q3.1 Easy (findFreezingTemperatures):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testFindFreezingTemperatures

    Test Q3.2 Medium (filterValidTransactions):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testFilterValidTransactions

    Test Q3.3 Hard (removeDuplicateSchedules):
    Bash

    mvn test -Dtest=JavaAssessmentPart2Test#testRemoveDuplicateSchedules
