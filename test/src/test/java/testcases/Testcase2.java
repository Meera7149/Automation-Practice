package testcases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;

public class Testcase2 {
  @Test(priority=1,groups={"smoke"},enabled=true,invocationCount=2)
  public void f1() {
	  System.out.println("f1 : " + Thread.currentThread().getName());
  }
  @Test(priority=3,groups={"smoke"})
  public void f3() {
	  System.out.println("f3");
	  //Assert.assertTrue(false);
  }
  @Test(priority=2,groups={"sanity"})
  public void f2() {
	  System.out.println("f2");
	  
  }
  @Test(dependsOnGroups= {"smoke","sanity"},priority=4)
  public void f4() {
	  System.out.println("f4");
  }
  
  
}
