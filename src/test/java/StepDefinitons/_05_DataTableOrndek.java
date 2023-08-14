package StepDefinitons;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableOrndek {
    @When("Write usernma {string}")
    public void writeUsernma(String userName) {
        System.out.println("userName = " + userName);

    }



    @And("Write username Password {string} and {string}")
    public void writeUsernamePasswordAnd(String userName, String paasword) {
        System.out.println("userName and password = " + userName+" "+paasword);
    }

    @And("Write username DataTable")
    public void writeUsernameDataTable(DataTable elemanlar) {
        List<String> listElemanlar =elemanlar.asList(String.class);


        for (String u :listElemanlar)
            System.out.println("u = " + u);
    }



    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable elemanlar) {

        List<List<String>> listElemanlar =elemanlar.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++) {
            System.out.println("listElemanlar = " + listElemanlar.get(i).get(0)+" "+ // username
                                                     listElemanlar.get(i).get(0));     // password

        }
    }
}
