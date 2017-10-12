package regex;

import java.util.*;

class Class1 {
  public Class1(int i) {
      printMe(i);
  }

  public void printMe(int i) {
      System.out.println("A new object of Class1 with arg = " + i);
  }
}

class Class2 {
	

  public Class1 create1(int i) {
      return new Class1(i) {
      };
  }

  
  public Class1 create2(int i) {
      return new Class1(i) {
          @Override
          public void printMe(int i) {
              System.out.println("A new object of Class1 with arg = " + i +
                      " created by overriding method in inner class");
          }
      };
  }
	
	
}

public class PE_1 {
  public static void main(String[] args) {
      int a = 28;
      Class2 class2 = new Class2();
      Class1 class1 = class2.create1(a);
      class1 = class2.create2(a);
  }
}
