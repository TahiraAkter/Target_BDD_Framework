package target.bdd.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass { // to run the driver 
	
	BaseClass baseClass;
	
	@Before
	public void beforeHook() {
		baseClass=new BaseClass();
		baseClass.setUp("chrome");
		
	}
	@After
	public void afterHook(){
		baseClass.quitDriver();
		
	}

}
