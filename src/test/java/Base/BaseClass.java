package Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
	//This class is created to store all the cucumber hooks
	
	@Before
	public void BeforeTest()
	{
		
		System.out.println("This step is created to run before every cucumber scenario");
	}
	
	@After
	public void AfterTest()
	{
		
		System.out.println("This step is created to run after every cucumber scenario");
	}

}
