package SampleTestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestClass001 {
	
			
		@BeforeTest
		public void befoMethod(){
			System.out.println("This is before method");
			//openbrowser();
			//navigateurl();
		}
		
		@Test (priority = 1)
		public void testMethod() {
		System.out.println("This is a test 1 method");
		
		}
		
		@Test (priority = 0)
		public void testMethod2() {
		System.out.println("This is a test 2 method");
		}
		
		
		@AfterTest
		public void afterTestMethod () {
			System.out.println("This is after method");
		}
	

}
