package TestNGAutomationExtends;

import org.testng.annotations.Test;

public class GalleryPage {

	public class MyTestClass1 extends AbstractTest {

		@Test(groups = "A")
		public void myTestMethod1() {
			System.out.println("myTestMethod1");
		}

		@Test(groups = "B")
		public void myTestMethod2() {
			System.out.println("myTestMethod2");
		}
	}

}
