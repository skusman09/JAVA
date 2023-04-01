// These Are The Methods
// AssertEqual
// AssertArrayEqual
// AssertNull
// AssertNotNull
// AssertTrue
// AssertFalse

package J_UNIT;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

  @Test
  void t1() {
    Operation op1 = new Operation();
    int result = op1.sum(3, 3);
    assertEquals(6, result, "Value Not Same");
  }

  @Test
  void t2() {
    Operation op2 = new Operation();
    int result = op2.mul(10, 5);
    assertEquals(55, result, "Value Not Same");
  }

  @Test
  void t3() {
    Operation op3 = new Operation();
    int result = op3.greaterNumber(5, 6, 8);
    assertEquals(8, result, "Value Not Same");
  }

  @Test
  void t4() {
    Operation op4 = new Operation();
    int result = op4.smallerNumber(5, 6, 8);
    assertEquals(5, result, "Value Not Same");
  }

  @Test
  void t5() {
    Operation op4 = new Operation();
    int result = op4.smallerNumber(5, 6, 8);
    assertNotEquals(5, result, "Value Not Same");
  }

  @Test
  void t6() {
    String str1 = "AzizA";
    Operation op5 = new Operation();
    String result = op5.reverseString(str1);
    assertEquals(str1, result, "values not same");
  }

  @Test
  void t7() {
    String str1 = "Aziz";
    Operation op6 = new Operation();
    String result = op6.reverseString1(str1);
    assertEquals(str1, result, "values not same");
  }

  @Test
  void t8() {
    String str1 = "Aziza";
    Operation op6 = new Operation();
    String result = op6.reverseString1(str1);
    assertNotEquals(str1, result);
  }

  @Test
  void t9() {
    String str1 = "AzizA";
    Operation op6 = new Operation();
    String result = op6.reverseString1(str1);
    assertNotEquals(str1, result, "values Is same");
  }

  @Test
  void t10() {
    int expect[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    Operation op7 = new Operation();
    int arr[] = op7.table(2);
    assertArrayEquals(expect, arr);
  }

  @Test
  void test10() {
    int expect[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    Operation op7 = new Operation();
    int arr[] = op7.table(4);
    assertArrayEquals(expect, arr);
  }

  @Test
  void t11() {
    String str = null;
    assertNull(str);
  }

  @Test
  void t12() {
    String str = "Usman";
    assertNull(str, "String Is Not Null");
  }

  @Test
  void t13() {
    String str = null;
    assertNotNull(str, "String Is Null");
  }

  @Test
  void t14() {
    String str = "Osama";
    assertNotNull(str);
  }

  @Test
  void t15() {
    assertFalse(4 < 9, "This Is Not False");
  }

  @Test
  void t16() {
    assertFalse(9 < 5, "This Is Not False");
  }

  @Test
  void t17() {
    assertTrue(2 > 12, "This Is Not True");
  }

  @Test
  void t18() {
    assertTrue(5 > 1, "This Is Not True");
  }
}
