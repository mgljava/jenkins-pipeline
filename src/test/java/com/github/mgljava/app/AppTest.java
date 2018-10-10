package com.github.mgljava.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  public void testSayHello() {
    App app = new App();
    assertEquals("Hello your name is mgl", app.sayHello("mgl"));
  }
}
