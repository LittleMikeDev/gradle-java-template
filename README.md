Gradle-Java Template
====================

[![Build Status](https://travis-ci.org/LittleMikeDev/gradle-java-template.svg?branch=master)](https://travis-ci.org/LittleMikeDev/gradle-java-template)
[![codecov.io](http://codecov.io/github/at-LittleMikeDev/gradle-java-template/coverage.svg?branch=master)](http://codecov.io/github/LittleMikeDev/gradle-java-template?branch=master)

This is a template for Java projects, including:

- Java 1.8
- Gradle build using gradle wrapper (to build, just use ./gradlew)
- JUnit, Hamcrest & Mockito dependencies
- .gitignore setup for Gradle build & Intellij files
- Jacoco code coverage reports
- Travis-CI ready (just enable the repository in Travis-CI)
- Code coverage reports uploaded to http://codecov.io (when Travis-CI build enabled)

Usage
=====

Clone the repo
Run ./setup.sh (this will leave you with a repo with a single initial commit)