package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\OpenCart_BDDFramework\\src\\main\\java\\features",
				 glue= {"stepDefinition"},
				 format={"pretty", "html:test-output"},
				 monochrome=true,
				 strict=true,
				 dryRun=false
)*/

/*@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\CucumberBDDFramework\\src\\main\\java\\features\\register.feature",
				 glue= {"stepDefinition"},
				 format={"pretty", "html:test-output"},
				 monochrome=true,
				 strict=true,
				 dryRun=false
)*/


/*@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\CucumberBDDFramework\\src\\main\\java\\features\\tagging.feature",
				 glue= {"stepDefinition"},
				 format={"pretty", "html:test-output"},
				 monochrome=true,
				 strict=true,
				 dryRun=false,
				 tags= {"~@Smoke","~@Regression"}
)*/

// tags="@Smoke,@Regression" -- It will execute scenario with either Smoke OR Regression tags
//tags= {"@Smoke","@Regression"} -- It will execute scenario with both Smoke AND Regression tags
//special character ~ neglects the tag


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\CucumberBDDFramework\\src\\main\\java\\features\\hooks.feature",
				 glue= {"stepDefinition"},
				 format={"pretty", "html:test-output"},
				 monochrome=true,
				 strict=true,
				 dryRun=false
)

public class Runner {

}
