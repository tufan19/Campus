package StepDefinitons;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.*;

import java.util.ArrayList;


public class _10_ApachePOISteps {
    DialogContent dc=new DialogContent();
    @When("User Create Citizenship With ApacehPOI")
    public void userCreateCitizenshipWithApacehPOI() {
        ArrayList<ArrayList<String> > tablo=ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen",1);

        for (ArrayList<String> satir : tablo) {
            dc.clickFunction(dc.addButton);
            dc.sendKeysFunction(dc.nameInput,satir.get(0));
            dc.sendKeysFunction(dc.shortName,satir.get(1));
            dc.clickFunction(dc.saveButton);
            dc.verifyCotainsTextFunction(dc.successMessage,"successfully");
        }
    }

    @Then("User Delete Citizenship With ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String> > tablo=ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen",2);

        for (ArrayList<String> satir : tablo) {
            dc.deleteItem(satir.get(0));
            dc.verifyCotainsTextFunction(dc.successMessage,"successfully");
        }
    }
}
