package com.example;


public class Greeter {

  
  public Greeter() {

  }
/**
* @param someone name of a person
* @return greeging string
*/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
