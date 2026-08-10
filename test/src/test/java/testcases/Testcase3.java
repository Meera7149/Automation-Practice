package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.RetryAnalyzer;

public class Testcase3 {
  @Test(priority=1)
  public void test1() {
	  System.out.println("test1");
	  Assert.assertTrue(false);
  }
  
  @Test(priority=2)
  public void test2() {
	  System.out.println("test2");  
  }
}
