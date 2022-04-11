package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


/*@CucumberOptions(features = {"src/test/java/features/Login.feature"},glue= {"steps"},
							dryRun = true,monochrome = true,
							snippets=SnippetType.CAMELCASE,plugin = {"html:report"})*/



@CucumberOptions(features= {"src/test/java/features/Test1.feature"},glue= {"steps"},
							dryRun=true, monochrome=true,
							strict=true)
public class Run extends AbstractTestNGCucumberTests {
	
	

}
