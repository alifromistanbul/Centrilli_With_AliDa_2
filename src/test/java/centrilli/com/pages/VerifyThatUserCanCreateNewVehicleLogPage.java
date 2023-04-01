package centrilli.com.pages;

import centrilli.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyThatUserCanCreateNewVehicleLogPage {

    public VerifyThatUserCanCreateNewVehicleLogPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@class='o_user_menu']/a/span")
    public WebElement posmanagerHomePage;

    @FindBy(xpath = "(//a[@href='#'])[1]")
    public WebElement moreBtn;

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[17]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//a[@href='/web#menu_id=148&action=165']/span")
    public WebElement vehicleServiceLogs;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement vehicleServiceLogsText;

    @FindBy(xpath = "//div[@class='o_cp_pager']/div/span[1]//span[2]")
    public WebElement vehicleServiceLogsNumber;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button")
    public WebElement createBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vehicleType;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li)[1]/a")
    public WebElement AudiA1AsVehicleType;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[2]")
    public WebElement ServiceType;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[2]/li[4]")
    public WebElement SummerTiresAsServiceType;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPrice;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;

    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']/button)[1]")
    public WebElement saveBtnWithoutSelectVehicle;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement warningMsg;

    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']/button)[2]")
    public WebElement discardBtn;

    @FindBy(tagName = "h4")
    public WebElement warningMsgForDiscard;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span")
    public WebElement okForWarning;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement attachmentBtn;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionBtn;

    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement nextBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='o_cp_pager']/div/span/span")
    public WebElement vehicleServiceNumber;

    @FindBy(xpath = "(//td[@class='o_data_cell o_required_modifier'])[12]")
    public WebElement newLogVehicle;

    @FindBy(xpath = "//button[@data-view-type='kanban']")
    public WebElement kanbanBtn;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_kanban_record']")
    public WebElement kanbanDisplay;

    @FindBy(xpath = "//button[@data-view-type='graph']")
    public WebElement graphBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement graphDisplay;

    @FindBy(xpath = "//button[@data-view-type='list']")
    public WebElement listBtn;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public WebElement listDisplay;







}
