package TestNGAutomationExtends;

import org.testng.annotations.Test;

public class JournalPage {

	public class MyTestClass2 extends AbstractTest {

		@Test(groups = "B")
		public void myTestMethod3() {
			System.out.println("myTestMethod3");
		}

		@Test(groups = "A")
		public void myTestMethod4() {
			System.out.println("myTestMethod4");
		}
	}
}