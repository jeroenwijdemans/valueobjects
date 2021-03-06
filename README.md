
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0b8d189eeab34d9cba6ac4d5e7e38453)](https://www.codacy.com/app/jeroenwijdemans/valueobjects?utm_source=github.com&utm_medium=referral&utm_content=jeroenwijdemans/valueobjects&utm_campaign=badger) 
[![Build Status](https://travis-ci.org/jeroenwijdemans/valueobjects.svg?branch=master)](https://travis-ci.org/jeroenwijdemans/valueobjects)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![codecov](https://codecov.io/gh/jeroenwijdemans/valueobjects/branch/master/graph/badge.svg)](https://codecov.io/gh/jeroenwijdemans/valueobjects)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.wijdemans/valueobjects/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.wijdemans/valueobjects)

## Value Objects lib
The value types allow for readable type-safe code.

Defines two classes: 

 - a base value object
 - an id
 
## Usage
 
 Each Serializable class (String, Integer, etc) in your project can 
 be replaced with a ValueObject.
 
 For example:
  
  ```
  String lastName
  ```
  
  can be change into
  
  ```
  LastName lastName
  ```
  
  by defining the following class:
  
  ```
  class LastName extends ValueType<String> {
    public LastName(String value) {
        super(value)
    }
  }
  ```
  