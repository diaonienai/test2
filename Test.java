import java.util.*;

public class Test {
  
  private static final int aa = 1;
  
  public void test() {
    int a = 1;
    int b = a + 1;
  }
  
  public void test(int var) {
    int a = 1;
    int b = a + 1;
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.test();
    aa = 2;
  }
  
  static class A {
  }
  
}
