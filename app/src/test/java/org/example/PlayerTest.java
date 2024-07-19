package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void playerToString() {
    App classUnderTest = new App();
    assertNotNull("player should have a string", classUnderTest.toString());
  }
}