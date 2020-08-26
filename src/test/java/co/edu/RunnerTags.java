package co.edu;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/Lex.feature",
		//tags = "@p",
		glue = "co.edu.eafit.definitions",
		
		snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}
