package J_UNIT;

class Operation {

  public int sum(int a, int b) {
    return a + b;
  }

  public int mul(int a, int b) {
    return a * b;
  }

  public int greaterNumber(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c && b > a) {
      return b;
    } else {
      return c;
    }
  }

  public int smallerNumber(int a, int b, int c) {
    if (a < b && a < c) {
      return a;
    } else if (b < c && b < a) {
      return b;
    } else {
      return c;
    }
  }

  public String reverseString(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }

  public String reverseString1(String str) {
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      newStr += str.charAt(i);
    }
    return newStr;
  }

  public int[] table(int num) {
    int arr[] = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = num * (i + 1);
    }
    return arr;
  }
}
