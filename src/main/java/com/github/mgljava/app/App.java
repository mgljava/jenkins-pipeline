package com.github.mgljava.app;


import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class App {

  public App() {
    log.info("App Constructor!");
  }

  public String sayHello(String name) {
    return "Hello your name is " + name;
  }
}
