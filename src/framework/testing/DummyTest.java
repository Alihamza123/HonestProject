package framework.testing;

import org.testng.annotations.Test;

import framework.config.TestCore;

public class DummyTest extends TestCore{

	@Test
	public void dummyStart(){
		startBrowser();
	}
	
}
