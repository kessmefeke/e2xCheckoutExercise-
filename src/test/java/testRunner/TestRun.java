package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(

		features=".//Features/Checkout.feature",
		glue={"stepDefintions"},
		dryRun=false,
		monochrome=true,
		plugin={"pretty"}
		//tags= {"@sanity","@regression"}
		


		)


public class TestRun {

}
