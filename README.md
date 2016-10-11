
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
  