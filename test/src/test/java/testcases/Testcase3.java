package testcases;

import org.testng.annotations.Test;

public class Testcase3 {
  @Test(priority=1)
  public void test1() {
	  System.out.println("test1 : " + Thread.currentThread().getName());
	  
  }
  
  @Test(priority=2)
  public void test2() {
	  System.out.println("test2");  
  }
}
