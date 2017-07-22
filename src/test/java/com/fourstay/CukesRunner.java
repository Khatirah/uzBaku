package com.fourstay;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber", "json:target/cucumber.json"},
						tags={"~@Regression","~@Test","@homepage","~@Test1"}, 
			//			glue="com/fourstay/step_defs", // shows the location of steps
			//			features="location/of/your/feature files", // shows features files location
						dryRun=false)

//+dryRun=true) // it does not execute the test, it will look for the steps 
// did you didnt implement, then suggests step defs with methods
// once you get the step definitions, delete it so you can run your test

public class CukesRunner {

}

/* whats the difference between maven project and regular project?
 we do dependencies using maven. pom.xml - project object model 
 paste dependencies from maven repository
 xml -- Extensible markup language
 xml is mostly used for messaging and communication 
 xml is platform independent -- 
 
 
 WebServices testing -one application talking to another application
 
 //this is Elnar adding first note.
  * this is khatirah making changes..x
  * 
  * adding some comment - k2
  *  //this is ELnar some changes
 
 // change again 
 */
//which changes
