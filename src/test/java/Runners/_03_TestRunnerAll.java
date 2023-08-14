package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitons"}
        //dryRun = true // true olduğunda testi çalıştırmaz sadece feature lara
        // ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.
        // oto kontrol gibi
)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
