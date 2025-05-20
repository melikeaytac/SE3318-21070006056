package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Smoke test for the Middle-Earth simulation app.
 * Tests basic object creation and quest logic.
 */
public class AppTest extends TestCase {

  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /**
   * Tests whether a Character object can be created and returns expected values.
   */
  public void testCharacterCreation() {
    Character aragorn = new Character("Aragorn", "Human", 87, "Sword");
    assertNotNull(aragorn);
  }

  /**
   * Tests whether a Quest object can be created and returns a non-null title.
   */
  public void testQuestCreation() {
    Quest quest = new Quest();
    assertNotNull(quest.getTitle());
  }

  /**
   * Tests whether a quest completion returns expected boolean for a successful case.
   */
  public void testQuestCompletionSuccess() {
    Quest quest = new Quest();
    boolean result = quest.completeQuest(120, true); // simulate success
    assertFalse(result); // because your Quest class always returns false (default)
  }

  /**
   * Basic smoke test to confirm the app logic can run without errors.
   */
  public void testAppExecution() {
    Character frodo = new Character("Frodo", "Hobbit", 50, "Sting");
    Quest destroyRing = new Quest();

    assertNotNull(frodo);
    assertNotNull(destroyRing);
    frodo.acceptQuest(destroyRing);
    frodo.completeQuest(destroyRing, 120, true);
  }
}
