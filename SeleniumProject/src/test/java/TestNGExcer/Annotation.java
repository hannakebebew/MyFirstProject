package TestNGExcer;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@ Test (groups = {"A"})
	
	public void annotationA () {
		
		System.out.println("This is exercise");
	}

	@ Test (dependsOnMethods = { "annotationc"})
	public void annotationB () {
		
		System.out.println("This is excersice2");
	}
	@Test (groups = {"4"})

	public void annotationC () {
	
		System.out.println("This is test1");

	}
@Test (enabled =false)

	public void annotationD () {
	
	System.out.println("This is should be ordered");
	
	}
	
@Test (groups= {"A"})
	public void annotationE () {
	
	System.out.println("This is hanna");
}


}
