package edu.cnm.deepdive.testone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOneMainClassTest {

  @Test
  void perfectCube() {

    assertTrue(TestOneMainClass.perfectCube(27));
    assertTrue(TestOneMainClass.perfectCube(125));
    assertFalse(TestOneMainClass.perfectCube(26));
    assertFalse(TestOneMainClass.perfectCube(19));
    assertFalse(TestOneMainClass.perfectCube(100));
    assertTrue(TestOneMainClass.perfectCube(64));
    assertTrue(TestOneMainClass.perfectCube(-64));
    assertFalse(TestOneMainClass.perfectCube(-65));

    assertTrue(TestOneMainClass.perfectCube(1000000000));

  }

  @Test
  void filterNegatives() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5},
        TestOneMainClass.filterNegatives(new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5}));


  }
}