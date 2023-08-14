package StepDefinitons;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav lf=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        lf.clickFunction(lf.setup);
        lf.clickFunction(lf.parameters);
        lf.clickFunction(lf.countries);
    }

    @When("create a country")
    public void createACountry() {

        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 8 harf  üretiyor
        String ulkeKodu= RandomStringUtils.randomNumeric(4); // 4 rakam  üretiyor

        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, ulkeAdi);
        dc.sendKeysFunction(dc.codeInput, ulkeKodu);
        dc.clickFunction(dc.saveButton); // TODO
    }

    @Then("Success message should be displayed")
    public void successMesageShouldBeDisplayed() {
        dc.verifyCotainsTextFunction(dc.successMessage,"successfully");
    }


    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String kod) {
        // feature files de name as diyerek ,değeri ordan gönderiyoruz
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.codeInput, kod);
        dc.clickFunction(dc.saveButton);


    }
}
