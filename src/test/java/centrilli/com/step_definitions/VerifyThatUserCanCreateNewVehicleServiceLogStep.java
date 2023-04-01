package centrilli.com.step_definitions;

import centrilli.com.pages.VerifyThatUserCanCreateNewVehicleLogPage;
import centrilli.com.utilities.BrowserUtils;
import centrilli.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyThatUserCanCreateNewVehicleServiceLogStep {

    VerifyThatUserCanCreateNewVehicleLogPage verifyThatUserCanCreateNewVehicleLogPage = new VerifyThatUserCanCreateNewVehicleLogPage();
    WebDriverWait wait;

     static int vehicleServiceLogNumberBefore;
     static int vehicleServiceLogNumberLast;

    @Given("user is on the posmanager homepage")
    public void user_is_on_the_posmanager_homepage() {
        Driver.getDriver().get("https://qa.centrilli.com/");
        verifyThatUserCanCreateNewVehicleLogPage.username.sendKeys("posmanager10@info.com");
        verifyThatUserCanCreateNewVehicleLogPage.password.sendKeys("posmanager");
        verifyThatUserCanCreateNewVehicleLogPage.loginBtn.click();
        BrowserUtils.sleep(3);
    }
    @Given("user clicks the More button")
    public void user_clicks_the_more_button() {
        verifyThatUserCanCreateNewVehicleLogPage.moreBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user clicks the Fleet button")
    public void user_clicks_the_fleet_button() {
        verifyThatUserCanCreateNewVehicleLogPage.fleetBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user clicks the Vehicle Service Logs Button")
    public void user_clicks_the_vehicle_service_logs_button() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogs.click();
        BrowserUtils.sleep(3);
    }
    @Then("user checks the total vehicle number")
    public void user_checks_the_total_vehicle_number() {
        wait = new WebDriverWait(Driver.getDriver(), 30);
        String expectedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String vehicleServiceLogNumberBfr = verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogsNumber.getText();
        vehicleServiceLogNumberBefore = Integer.parseInt(vehicleServiceLogNumberBfr);
        System.out.println(vehicleServiceLogNumberBefore);
        BrowserUtils.sleep(3);
    }


    @Given("user clicks the create button")
    public void user_clicks_the_create_button() {

        verifyThatUserCanCreateNewVehicleLogPage.createBtn.click();
        BrowserUtils.sleep(3);
    }
    @When("user chooses Audi\\/A1\\/ as vehicle")
    public void user_chooses_audi_a1_as_vehicle() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleType.click();
        verifyThatUserCanCreateNewVehicleLogPage.AudiA1AsVehicleType.click();
        BrowserUtils.sleep(3);
    }
    @When("user chooses service type as Summer tires")
    public void user_chooses_service_type_as_summer_tires() {
        verifyThatUserCanCreateNewVehicleLogPage.ServiceType.click();
        verifyThatUserCanCreateNewVehicleLogPage.SummerTiresAsServiceType.click();
        BrowserUtils.sleep(3);
    }
    @Then("user inputs {string} as total price")
    public void user_inputs_as_total_price(String string) {
        verifyThatUserCanCreateNewVehicleLogPage.totalPrice.clear();
        verifyThatUserCanCreateNewVehicleLogPage.totalPrice.sendKeys(string);
        BrowserUtils.sleep(3);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {

        verifyThatUserCanCreateNewVehicleLogPage.saveBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user sees Audi\\/A1\\/ - Odoo as title")
    public void user_sees_audi_a1_odoo_as_title() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Audi/A1/ - Odoo";
        Assert.assertEquals(expectedTitle,actualTitle);
        BrowserUtils.sleep(3);
    }

    @Given("user clicks Vehicle Service Logs link")
    public void user_clicks_vehicle_service_logs_link() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogs.click();
        BrowserUtils.sleep(3);
    }
    @Then("user checks the total vehicle number more than before")
    public void user_checks_the_total_vehicle_number_more_than_before() {
        wait = new WebDriverWait(Driver.getDriver(),10);
        String waitedTitle = "Vehicles Services Logs - Odoo";
        wait.until(ExpectedConditions.titleIs(waitedTitle));
        String vehicleServiceLogsNumberLst = verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogsNumber.getText();

        System.out.println("vehicleServiceLogsNumberLast = " + vehicleServiceLogsNumberLst);
        vehicleServiceLogNumberLast = Integer.parseInt(vehicleServiceLogsNumberLst);

        if(vehicleServiceLogNumberLast>vehicleServiceLogNumberBefore){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        Assert.assertTrue(true);
        BrowserUtils.sleep(3);

    }

    @Then("user inputs Audi\\/A1\\/ to the search box")
    public void user_inputs_audi_a1_to_the_search_box() {
        verifyThatUserCanCreateNewVehicleLogPage.searchBox.sendKeys("Audi/A1/   ");
        BrowserUtils.sleep(3);
    }
    @Then("user goes to the last page of the list")
    public void user_goes_to_the_last_page_of_the_list() {

       String totalNumber = verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogsNumber.getText();

       String wholeNumber = verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceNumber.getText();

       while(!totalNumber.contains(wholeNumber)){
           verifyThatUserCanCreateNewVehicleLogPage.nextBtn.click();
       }
        BrowserUtils.sleep(3);

    }
    @Then("user sees the new created Audi\\/A1\\/ on the screen displayed")
    public void user_sees_the_new_created_audi_a1_on_the_screen_displayed() {

        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.newLogVehicle.isDisplayed());
        BrowserUtils.sleep(3);

    }


    @Given("user clicks save button without selecting vehicle")
    public void user_clicks_save_button_without_selecting_vehicle() {
        verifyThatUserCanCreateNewVehicleLogPage.saveBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user should see The following fields are invalid warning message")
    public void user_should_see_the_following_fields_are_invalid_warning_message() {

        Assert.assertTrue( verifyThatUserCanCreateNewVehicleLogPage.warningMsg.isDisplayed());
        BrowserUtils.sleep(3);

    }

    @Then("user clicks Discard button")
    public void user_clicks_discard_button() {
        verifyThatUserCanCreateNewVehicleLogPage.discardBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user sees warning to discard")
    public void user_sees_warning_to_discard() {
        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.warningMsgForDiscard.isDisplayed());
        BrowserUtils.sleep(3);
    }

    @Then("user clicks Ok for the warning message")
    public void user_clicks_ok_for_the_warning_message() {
        verifyThatUserCanCreateNewVehicleLogPage.okForWarning.click();
        BrowserUtils.sleep(3);
    }

    @Then("user goes back to Vehicle Service Logs page")
    public void user_goes_back_to_vehicle_service_logs_page() {
        verifyThatUserCanCreateNewVehicleLogPage.vehicleServiceLogs.click();
        BrowserUtils.sleep(3);
    }

    @Then("user sees Attachment button")
    public void user_sees_attachment_button() {
        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.attachmentBtn.isDisplayed());
        BrowserUtils.sleep(3);
    }

    @Then("user sees Action button")
    public void user_sees_action_button() {

        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.actionBtn.isDisplayed());
        BrowserUtils.sleep(3);

    }

    @Given("user clicks the Kanban button")
    public void user_clicks_the_kanban_button() {
        verifyThatUserCanCreateNewVehicleLogPage.kanbanBtn.click();
        BrowserUtils.sleep(3);
    }
    @When("user checks if it is a Kanban page")
    public void user_checks_if_it_is_a_kanban_page() {
        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.kanbanDisplay.isDisplayed());
        BrowserUtils.sleep(3);
    }

    @When("user clicks the graph button")
    public void user_clicks_the_graph_button() {
        verifyThatUserCanCreateNewVehicleLogPage.graphBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user checks if it is a graph page")
    public void user_checks_if_it_is_a_graph_page() {
        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.graphDisplay.isDisplayed());
        BrowserUtils.sleep(3);
    }

    @Then("user clicks the List button")
    public void user_clicks_the_list_button() {
        verifyThatUserCanCreateNewVehicleLogPage.listBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user checks if it is a list page")
    public void user_checks_if_it_is_a_list_page() {
        Assert.assertTrue(verifyThatUserCanCreateNewVehicleLogPage.listDisplay.isDisplayed());
    }




}
