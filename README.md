PeriplusCartTesting
====================

Repository: https://github.com/AndaruHP/PeriplusCartTesting

Purpose
-------
This repository contains a small automated test suite for the Periplus website focused on cart-related flows (search, add to cart, view cart). It is implemented with Selenium WebDriver and TestNG to be used as a submission or demo of automated tests.

Minimal instructions
--------------------

Prerequisites
- JDK 21
- Maven
- Chrome (and ChromeDriver on PATH) or a configured WebDriver

Build

Run a normal build (skip tests if you want):

```
mvn -DskipTests package
```

Run tests

This project uses TestNG and `testng.xml` as the suite configuration. Tests read credentials and test data from system properties or environment variables. Defaults are present in the test code but you should override them when submitting or running in CI.

Examples (PowerShell):

```
# run tests with custom credentials and search query
mvn -Dperiplus.user="you@example.com" -Dperiplus.password="SecretPwd" -Dperiplus.search="Some Book" test
```

Or set environment variables (CI):

```
$env:PERIPLUS_USER = "you@example.com"
$env:PERIPLUS_PASSWORD = "SecretPwd"
$env:PERIPLUS_SEARCH = "Some Book"
mvn test
```

What to include when submitting
- `pom.xml`
- `testng.xml`
- `src/` (source + tests)
- `README.md` (this file)

What not to include
- `target/` (build artifacts)
- local binaries or drivers
- real credentials (use properties or environment variables instead)

Notes
- Tests are executed via TestNG suite `testng.xml` and Maven Surefire plugin.
- If tests require ChromeDriver, ensure it is available on PATH or configure the WebDriver accordingly.

That's it — minimal and ready to submit.

