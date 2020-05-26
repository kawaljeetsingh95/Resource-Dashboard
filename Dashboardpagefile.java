package net.automation.pages;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Dashboardpagefile extends PageObject

{
    @FindBy(xpath = "//span[@class='v-btn__content']")
    WebElementFacade login;
    @FindBy(xpath = "//input[@type='email']")
    WebElementFacade userfield;
    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade passfield;
    @FindBy(xpath = "//span[text()='Next']")
    WebElementFacade next;
    @FindBy(xpath = "//span[@class='v-btn__content']/i[@class='v-icon notranslate mdi mdi-menu theme--dark']")
    WebElementFacade menubar;
    @FindBy(xpath = "//div[text()='Project Initiation']")
    WebElementFacade initiate;
    @FindBy(xpath = "//div[text()='Project Dashboard']")
    WebElementFacade clickonprojectdashboard;
    @FindBy(xpath = "//button[contains(@class,'v-icon notranslate pa-2 v-icon--link mdi mdi-p')]")
    WebElementFacade editbuttonvisible;
    @FindBy(xpath = "//a[contains(@class,'text-capitalize v-tab ')]")
    WebElementFacade projectdetails;
    @FindBy(xpath = "//i[contains(@class,'v-icon notranslate mdi mdi-logout')]")
    WebElementFacade logout;
    @FindBy(xpath = "//button[contains(@class,'marginauto v-btn')]")
    WebElementFacade okpopup;
    @FindBy(xpath = "//div[text()='This field required only positive integer value']")
    WebElementFacade Approvedhoursmessage;
    @FindBy(xpath = "//div[text()='This field must contain alphabet and spaces']")
    WebElementFacade Clientnamemessage;
    @FindBy(xpath = "//div[text()='This field must be a valid email']")
    WebElementFacade Emailmessage;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    WebElementFacade ApprovedhoursField;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    WebElementFacade ClientField;
    @FindBy(xpath = "(//input[@type='text'])[7]")
    WebElementFacade EmailField;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    WebElementFacade ProjectnameField;
    @FindBy(xpath = "(//textarea[@style='height: 32px;'])[1]")
    WebElementFacade projectsummaryfield;
    @FindBy(xpath = "(//textarea[@style='height: 32px;'])[2]")
    WebElementFacade companyaddressfield;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElementFacade companynamefield;
    @FindBy(xpath = "(//input[@type='text'])[8]")
    WebElementFacade projectdomainfield;
    @FindBy(xpath = "//span[contains(@class,'v-chip v-chip')]")
    WebElementFacade projectdomainbvalue;
    @FindBy(xpath = "(//input[@type='text'])[11]")
    WebElementFacade projectdocumentlinkfield;
    @FindBy(xpath = "(//textarea[@style='height: 32px;'])[3]")
    WebElementFacade specificrequestfield;
    @FindBy(xpath = "(//input[@type='text'])[9]")
    WebElementFacade Technologyfield;
    @FindBy(xpath = "//div[text()='Php - Laravel']")
    WebElementFacade phpvalue;
    @FindBy(xpath = "(//input[@type='text'])[12]")
    WebElementFacade AMField;
    @FindBy(xpath = "//div[contains(@class,'v-list-item v-list-item--link theme--light ')]")
    WebElementFacade AMvalue;
    @FindBy(xpath = "(//input[@type='text'])[13]")
    WebElementFacade PMField;
    @FindBy(xpath = "//div[contains(@class,'v-list-item v-list-item--link theme--light v-list-item--hi')]")
    WebElementFacade PMvalue;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[5]")
    WebElementFacade InitiationSubmitButton;
    @FindBy(xpath = "//a[@href='#tab-2']")
    WebElementFacade OpenRequestTab;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[1]")
    WebElementFacade DiabledRequestedBY;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[2]")
    WebElementFacade DiabledRequestedOn;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[3]")
    WebElementFacade DiabledProjectname;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[4]")
    WebElementFacade DiabledAM;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[5]")
    WebElementFacade DiabledPM;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[6]")
    WebElementFacade DisabledTechnologies;
    @FindBy(xpath = "(//div[contains(@class,'v-input v-input')])[7]")
    WebElementFacade DisabledBillingtype;
    @FindBy(xpath = "//button[contains(@class,'text-capitalize v-btn ')]")
    WebElementFacade ClickonCreationSubmit;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[4]")
    WebElementFacade creationpopupmessage;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[2]")
    WebElementFacade AddRequisitionButton;
    @FindBy(xpath = "(//input[@type='text'])[5]")
    WebElementFacade NumberOfResourcesField;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    WebElementFacade DailyEffortsField;
    @FindBy(xpath = "(//input[@type='text'])[7]")
    WebElementFacade ExperienceField;
    @FindBy(xpath = "//div[text()='This field required only positive integer value']")
    WebElementFacade NumberOFResourceValidation;
    @FindBy(xpath = "//div[text()='This field must be greater than 0 and less than 8']")
    WebElementFacade DailyEffortsValidation;
    @FindBy(xpath = "//div[text()='This field must be greater than 0 and less than 35']")
    WebElementFacade ExperienceValidation;
    @FindBy(xpath = "(//div[@class='v-select__selections'])[1]")
    WebElementFacade RequisitionDepartmentField;
    @FindBy(xpath = "(//div[@class='v-select__selections'])[2]")
    WebElementFacade RequisitionTechnologyField;
    @FindBy(xpath = "(//div[@class='v-select__selections'])[3]")
    WebElementFacade RequisitionRoleField;
    @FindBy(xpath = "(//input[@type='text'])[8]")
    WebElementFacade StartDateField;
    @FindBy(xpath = "//div[text()='6']")
    WebElementFacade StartDateValue;
    @FindBy(xpath = "(//input[@type='text'])[9]")
    WebElementFacade EndDateField;
    @FindBy(xpath = "(//div[text()='20'])[2]")
    WebElementFacade EndDateValue;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[6]")
    WebElementFacade RequisitionSaveButton;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[6]")
    WebElementFacade ClickOnRequisitionSubmitButton;
    @FindBy(xpath = "//button[contains(@class,'marginauto v-btn v-bt')]")
    WebElementFacade ClickOnRequisitionpopupmessage;
    @FindBy(xpath = "//div[text()='Project Dashboard']")
    WebElementFacade projectdashboardlink;
    @FindBy(xpath = "//div[text()='Resource Dashboard']")
    WebElementFacade resourcedashboardlink;
    @FindBy(xpath = "//button[contains(@class,'v-icon notranslate v-icon--link mdi mdi-delete theme--light')]")
    WebElementFacade RequisitionDeleteButton;
    @FindBy(xpath = "//div[@class='v-card__text pa-4']")
    WebElementFacade DeleteItemValidation;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[7]")
    WebElementFacade CancelItemRequisitionButton;
    @FindBy(xpath = "//button[contains(@class,'v-icon notranslate mr-2 v-icon--link mdi mdi-pencil ')]")
    WebElementFacade EditItemRequisitionButton;
    @FindBy(xpath = "(//td[@class='text-start'])[2]")
    WebElementFacade EditRequisitionRolevalue;
    @FindBy(xpath = "(//td[@class='text-start'])[3]")
    WebElementFacade EditRequisitionTechnologyvalue;
    @FindBy(xpath = "(//td[@class='text-start'])[4]")
    WebElementFacade EditRequisitionNumberofResourcevalue;
    @FindBy(xpath = "(//td[@class='text-start'])[5]")
    WebElementFacade EditRequisitionDailyEffortsvalue;
    @FindBy(xpath = "(//td[@class='text-start'])[6]")
    WebElementFacade EditRequisitionExperiencevalue;
    @FindBy(xpath = "(//td[@class='text-start'])[7]")
    WebElementFacade EditRequisitionstartdatevalue;
    @FindBy(xpath = "(//td[@class='text-start'])[8]")
    WebElementFacade EditRequisitionenddatevalue;
    @FindBy(xpath = "//button[contains(@class,'text-capitalize v-btn v-btn--contained')]")
    WebElementFacade EditRequisitionsubmitbutton;
    @FindBy(xpath = "(//div[@class='v-select__selections'])[2]")
    WebElementFacade EditRequisitionDepartmentField;
    @FindBy(xpath = "(//div[@class='v-select__selections'])[3]")
    WebElementFacade EditRequisitionTechnologyField;
    @FindBy(xpath = "(//div[@class='v-select__selections'])[4]")
    WebElementFacade EditRequisitionRoleField;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    WebElementFacade EditNumberOfResourcesField;
    @FindBy(xpath = "(//input[@type='text'])[7]")
    WebElementFacade EditDailyEffortsField;
    @FindBy(xpath = "(//input[@type='text'])[8]")
    WebElementFacade EditExperienceField;
    @FindBy(xpath = "(//button[contains(@class,'text-capitalize v-btn v-btn--f')])[2]")
    WebElementFacade EditRequisitionSaveButton;
    @FindBy(xpath = "//div[@class='v-text-field__slot']")
    WebElementFacade SearchProjectName;
    @FindBy(xpath = "//button[contains(@class,'v-icon notranslate pa-2 v-icon--link mdi mdi-ey')]")
    WebElementFacade viewbuttonvisible;
    @FindBy(xpath = "//div[contains(@class,'v-list-item v-list-item--link theme--light')]")
    WebElementFacade ClickonAllocationoption;
    @FindBy(xpath = "(//td[@class='text-center'])[3]")
    WebElementFacade BillingText;
    @FindBy(xpath = "(//button[contains(@class,'text-capitalize v-btn v-btn--contained v')])[1]")
    WebElementFacade AllocateButton;
    @FindBy(xpath = "(//input[@type='text'])[5]")
    WebElementFacade FirstAllocationResourceName;
    @FindBy(xpath = "(//input[@type='text'])[10]")
    WebElementFacade SecondAllocationResourceName;
    @FindBy(xpath = "//button[contains(@class,'text-capitalize v-btn v-btn--contained them')]")
    WebElementFacade AllocationSubmitButton;
    @FindBy(xpath = "(//div[@class='v-card__text'])[2]")
    WebElementFacade PartialAllocationValidation;
    @FindBy(xpath = "(//button[contains(@class,'marginauto v-btn')])[2]")
    WebElementFacade YesButtonOfValidation;
    @FindBy(xpath = "(//button[contains(@class,'marginauto v-btn')])[3]")
    WebElementFacade Allocationokpop;
    @FindBy(xpath = "(//td[@class='text-start'])[5]")
    WebElementFacade UpdatedDailyEfforts;
    @FindBy(xpath = "(//div[contains(@class,'v-list-item v-list-item--link theme--light')])[1]")
    WebElementFacade AcceptDeclineoption;
    @FindBy(xpath = "(//button[contains(@class,'v-icon notranslate mdi-2')])[1]")
    WebElementFacade Approveicon;
    @FindBy(xpath = "//button[contains(@class,'text-capitali')]")
    WebElementFacade AcceptDeclineBackButton;
    @FindBy(xpath = "//div[@class='xkfVF']")
    WebElementFacade usernamepasswordwindow;
    @FindBy(xpath = "//button[contains(@class,'text-capitalize ma-2 white--text v-')]")
    WebElementFacade AllocationBackButton;
    @FindBy(xpath = "(//td[@class='text-start'])[1]")
    WebElementFacade VerifyFirstResourceName;
    @FindBy(xpath = "(//td[@class='text-start'])[9]")
    WebElementFacade VerifySecondResourceName;
    @FindBy(xpath = "(//td[@class='text-start'])[17]")
    WebElementFacade DeclineStatusOne;
    @FindBy(xpath = "(//td[@class='text-start'])[26]")
    WebElementFacade DeclineStatusTwo;
    @FindBy(xpath = "(//td[@class='text-start'])[17]")
    WebElementFacade ApprovedStatusOne;
    @FindBy(xpath = "(//td[@class='text-start'])[26]")
    WebElementFacade ApprovedStatusTwo;
    @FindBy(xpath = "(//div[contains(@class,'v-list-item v-list-item--link theme--light')])[1]")
    WebElementFacade MappingOptionVisible;
    @FindBy(xpath = "//button[contains(@class,'text-capitalize v-btn v-b')]")
    WebElementFacade MappingSubmitButton;
    @FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[3]")
    WebElementFacade Dropdownicon;
    @FindBy(xpath = "(//button[contains(@class,'marginauto v-btn')])")
    WebElementFacade FullyAllocationokpop;

    public void setLogin()
    {
        withAction().click(login).perform();//This is login button when user click on it then it will land on to the dashboard page

    }

    public void setuserpassfiled(String user, String pass)
    {
        waitABit(3000);
        Set<String> windows = getDriver().getWindowHandles();//In this we have to create the object to handle the window
        Iterator<String> itr = windows.iterator();//This statement is used to iterate the window
        while (itr.hasNext()) //This statement is used if next window is available
        {
            getDriver().switchTo().window(itr.next());//This statement is used when user want to switch to the other window
        }

    withTimeoutOf(20,TimeUnit.SECONDS).waitFor(userfield).waitUntilVisible();   //This statement is use for wait until userfield is not available

        userfield.sendKeys(user);   //This statement is use to send the value in to the userfield
        next.click();   //Then click on the next button

      withTimeoutOf(20,TimeUnit.SECONDS).waitFor(passfield).waitUntilVisible();   //This statment is use for wait until passfield is not available

        passfield.sendKeys(pass);//This statement is use to send the value in the password field
        next.waitUntilClickable();//wait until next button is not clickable
        next.click();//After fill the Password field then click on the next button






    }

    public void switchTolatesttab()
    {
        Set<String> windows = getDriver().getWindowHandles();//In this we have to create the object to handle the window
        Iterator<String> itr = windows.iterator();//This statement is used to iterate the window
        while (itr.hasNext()) //This statement is used if next window is available
        {
            getDriver().switchTo().window(itr.next());//This statement is used when user want to switch to the other window
        }
    }

    public void LeftPanelMenuoption()
    {

       waitABit(12000);
       switchTolatesttab();//After fill the Password and user field then this statement is used to latest switch the window

       withTimeoutOf(25,TimeUnit.SECONDS).waitFor(menubar).waitUntilClickable();//It will wait until menu option not clickable

        withAction().click(menubar).perform();//with the help of action class this statament is click on the Menu option which is located at left side corner of the dashboard
       getDriver().manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

    }

    public void ResourceDashboardOption(String resourcedashboard)
    {
        Actions actions = new Actions(getDriver());//Create an object with an action class

        actions.moveToElement(getDriver().findElement(By.xpath("//div[text()='Resource Dashboard']"))).perform();//with the help of action object this statement is use to hover to the Resource dashboard link that is visible after click on the Menu option(menubar)

        if (resourcedashboard.equalsIgnoreCase("present")) // resourcedashboard  value can get from the dataTable in which that value is equal to the present then it will enter in to the if condition
        {
            resourcedashboardlink.isDisplayed();//This statement is use to compare whether the resourcedashboardlink is display to the respective users

            Assert.assertEquals("Resource Dashboard", resourcedashboardlink.getText());//Here we apply the assertion to compare whether the text will be correctly visible or not
        }



    }

    public void initiationoption(String initiation)
    {
        Actions actions = new Actions(getDriver());
        waitABit(2000);
        actions.moveToElement(projectdashboardlink).perform();//This statement is user to hover on to the project dashbaord link after click on the menu option
        waitABit(2000);


        if (initiation.equalsIgnoreCase("present"))//If initiation value is equals to the present then enter in to the body other wise it will enter in to the else part(only visible to Global operation and sales)
        {
            initiate.isDisplayed();//Initaition link should be display after clcik on the menu option

            Assert.assertEquals("Project Initiation", initiate.getText());//here we comparing the text by applying the assertions
        } else {

            initiate.shouldNotBeCurrentlyVisible();//if it is absent that means initiation should not be visible to the Resource manager(RM)and BU Head



        }
    }

    public  void ProjectDashboardOption(String projectdashboard)
    {

        Actions actions = new Actions(getDriver());//creating an object with the Actions
        waitABit(2000);
        actions.moveToElement(getDriver().findElement(By.xpath("//div[text()='Project Dashboard']"))).perform();//with the help of the action object it will hover to the project dashboard after click on the menu option(menubar)
        waitABit(2000);


        if (projectdashboard.equalsIgnoreCase("present")) //If projectdashboard value equals to the present then it will enter in to the if body
        {
            projectdashboardlink.isDisplayed();//check that project dashboard link should be display
            waitABit(2000);
            Assert.assertEquals("Project Dashboard", projectdashboardlink.getText());//Apply the assertion to compare the text
        }
    }



    public void Editbutton() {
        waitABit(2000);
        withAction().click(clickonprojectdashboard).perform();//After visiblity of the links then clcik on the project dashboard
        waitABit(13000);
        if (editbuttonvisible.isVisible())//Edit button is visisble to the respective users
        {
            System.out.println("edit button visible to GO/Sales only");//It is visible to Global operation and sales user
        } else {
            System.out.println("edit button not visible to BU,RM");//Not visible to the BU Head and Resource manager
        }


    }

    public void setLogout() {

      withTimeoutOf(25,TimeUnit.SECONDS).waitFor(logout).waitUntilClickable();

        withAction().click(logout).perform();//Then click on the logout button with the action class
        getDriver().close();

    }

    public void FillGOuserpassword(String userargs, String passargs) {

        setLogin();//Recall  this method in to this FillGouserpassword methos
        waitABit(3000);
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            getDriver().switchTo().window(itr.next());
        }

       withTimeoutOf(20,TimeUnit.SECONDS).waitFor(userfield).waitUntilVisible();

        userfield.sendKeys(userargs);//Fill the global operation user in to the field
        next.click();

      withTimeoutOf(20,TimeUnit.SECONDS).waitFor(passfield).waitUntilVisible();

        passfield.sendKeys(passargs);//Fill the global operation password in to taht filed
        next.waitUntilClickable();
        next.click();
      getDriver().manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);


    }

    public void ChooseTheInitiationOption()
    {

        Actions actions = new Actions(getDriver());

        waitABit(3000);
        actions.moveToElement(getDriver().findElement(By.xpath("(//a[contains(@class,'v-list-item')])[1]"))).perform();//hover to the link after clcik on the menu option

        initiate.waitUntilVisible();
        initiate.waitUntilClickable();
     //   withTimeoutOf(10,TimeUnit.SECONDS).waitFor(initiate).waitUntilVisible();
        waitABit(2000);
        withAction().click(initiate).perform();
       waitForPresenceOf("(//input[@type='text'])[4]");
        waitABit(12000);




    }

    public void GivingWrongInputInTheFields(DataTable dataTable)
    {
        waitABit(2000);
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(ApprovedhoursField).waitUntilClickable();//After enter in to the initiation form wait until approvedhoursfield is not clcikable

        withAction().click(ApprovedhoursField).perform();//Then click on that field
        String Field1 = data.get(0).get("Fields input");//get the value from the datatable

        ApprovedhoursField.sendKeys(Field1);//Fill the wong value in that field from the datatable
        String verification1 = data.get(0).get("validation message");//get the validation message from the datatable
        String Msg1 = Approvedhoursmessage.getText();//get the validation message
        Assert.assertEquals(verification1, Msg1);//then compare datatable value and the gettext value



        waitForPresenceOf("(//input[@type='text'])[6]");//wiat for the presence of client field

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(ClientField).waitUntilClickable();//wait until client filed not clickable

        withAction().click(ClientField).perform();//clcik on the client field
        String Field2 = data.get(1).get("Fields input");//get the value from the data table

        ClientField.sendKeys(Field2);//Fill the wrong value in that filed
        String verification2 = data.get(1).get("validation message");//get the validation message in the cleint field
        String Msg2 = Clientnamemessage.getText();//get the message and store it
        Assert.assertEquals(verification2, Msg2);//then compare it the datatable abd gettext value

        waitForPresenceOf("(//input[@type='text'])[7]");//wait until email filed is not presence

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(EmailField).waitUntilClickable();//wait until email field i snot clcikable

        withAction().click(EmailField).perform();//then clcik on that filed
        String Field3 = data.get(2).get("Fields input");//get the value from the datatable

        EmailField.sendKeys(Field3);//Fill the wrong value in the email filed
        String verfication3 = data.get(2).get("validation message");//get the validation message of the email filed from the datatable
        String Msg3 = Emailmessage.getText();//get the message through the getetext and store it
        Assert.assertEquals(verfication3, Msg3);//compare the value through the assertion

    }


    public void filltheinitiationform(DataTable dataTable)
    {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        ProjectnameField.waitUntilVisible();//wait until project name field not visible


        String project = data.get(0).get("Project name");//get the project name from the datatable

        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(ProjectnameField).waitUntilClickable();

        withAction().click(ProjectnameField).perform();//click on the project name filed

        ProjectnameField.sendKeys(project);//fill the project name from the data table

        projectsummaryfield.waitUntilVisible();//wait until projectsummaryfiled not visibvle
        projectsummaryfield.waitUntilClickable();//wait until project summary filed not clcikable
        String summary = data.get(0).get("Project Summary");//get the value form the datatble
        withAction().click(projectsummaryfield).perform();//click on the project summary field
        projectsummaryfield.sendKeys(summary);//fill the value from the datatable

        companyaddressfield.waitUntilVisible();
        companyaddressfield.waitUntilClickable();
        String address = data.get(0).get("Company Address");//get the company address from the data table
        withAction().click(companyaddressfield).perform();//click on that field
        companyaddressfield.sendKeys(address);//fill the company address filed by getting value from the datatable

        companynamefield.waitUntilVisible();
        companynamefield.waitUntilClickable();
        String company = data.get(0).get("Company name");//get the value from the data table
        withAction().click(companynamefield).perform();//click on the companyname filed
        companynamefield.sendKeys(company);//fill the value in to that field

        ApprovedhoursField.waitUntilVisible();
        ApprovedhoursField.waitUntilClickable();
        String hours = data.get(0).get("Total Approved Hours");//get the hours value from the datatable
        withAction().click(ApprovedhoursField).perform();//click on that filed
        ApprovedhoursField.sendKeys(hours);//fill the value from the datable

        ClientField.waitUntilVisible();
        ClientField.waitUntilClickable();
        String client = data.get(0).get("Client Name 1");//get the client value form the datatble
        withAction().click(ClientField).perform();//clcik on the client name field
        ClientField.sendKeys(client);//fill the value from the datatable in to the clientname filed

        EmailField.waitUntilVisible();
        EmailField.waitUntilClickable();
        String Email = data.get(0).get("Client Email address 1");//get the client email value from the datatble
        withAction().click(EmailField).perform();//click on the email field
        EmailField.sendKeys(Email);//fill the value in that filed

        projectdomainfield.waitUntilVisible();
        projectdomainfield.waitUntilClickable();
        String Domain = data.get(0).get("Project Domain");//get the project domain value from the datatable
        withAction().click(projectdomainfield).perform();//click on the project domain field
        projectdomainfield.sendKeys(Domain);//fill the value in that field by getting the value from the datatable

        withAction().click(projectdomainbvalue).perform();//selecting the value from the project domain

        String deliverables = data.get(0).get("Project Components/ Deliverables");//get the deliverables value from the datatable
        withAction().click(getDriver().findElement(By.xpath("//label[text()='" + deliverables + "']"))).perform();//clcik on the deleiverables value and here we are using dynamic xpath

        projectdocumentlinkfield.waitUntilVisible();
        projectdocumentlinkfield.waitUntilClickable();
        String link = data.get(0).get("Project Documents Link 1");//get the value from the datable of the project document link
        withAction().click(projectdocumentlinkfield).perform();//clcik on that field
        projectdocumentlinkfield.sendKeys(link);//fill the value in that field

        specificrequestfield.waitUntilVisible();
        specificrequestfield.waitUntilClickable();
        String concern = data.get(0).get("Any specific set of requests/concerns");//get the value from the datable of the specific field

        withAction().click(specificrequestfield).perform();//clcik on th at field
        specificrequestfield.sendKeys(concern);//fill the value in to that field

        String account = data.get(0).get("Assign Account Manager");//get the AM value from the datatable

        withAction().click(AMField).perform();//click on that field
        AMField.sendKeys(account);//fill the value in that field
        withAction().click(AMvalue).perform();//select the value for that AM field

        String projectmanager = data.get(0).get("Assign Project Manager");//get the value from the datatable of the project manager field
        PMField.waitUntilVisible();
        PMField.waitUntilClickable();
        withAction().click(PMField).perform();//click on that field
        PMField.sendKeys(projectmanager);//fill the value in that field
        withAction().click(PMvalue).perform();//select the value in that field

        Technologyfield.waitUntilVisible();
        Technologyfield.waitUntilClickable();
        String Tech = data.get(0).get("Technology");//get the technology value in that field
        withAction().click(Technologyfield).perform();//clcik on that field
        withAction().click(phpvalue).perform();//select the value in that field


        getDriver().findElement(By.xpath("//button[contains(@class,'text-capitalize v-')]")).isEnabled();//check submit button should be enabled after fill all the field in that form
    }

    public void submit() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",InitiationSubmitButton );//This statement is use to scroll down to the initiation submit button

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(InitiationSubmitButton).waitUntilClickable();

        withAction().click(InitiationSubmitButton).perform();//click on the initiation submit button

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(okpopup).waitUntilVisible();
    }

    public void popup() {
       withTimeoutOf(20,TimeUnit.SECONDS).waitFor(okpopup).waitUntilClickable();

        withAction().click(okpopup).perform();//click on the ok pop message

        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(logout).waitUntilVisible();


    }

    public void RMusernameandpassword(String RMuser, String RMpass) {
        setLogin();//recall that method
        waitABit(3000);
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            getDriver().switchTo().window(itr.next());
        }

       withTimeoutOf(20,TimeUnit.SECONDS).waitFor(userfield).waitUntilVisible();

        userfield.sendKeys(RMuser);//fill the resource manager user
        next.click();

       withTimeoutOf(20,TimeUnit.SECONDS).waitFor(passfield).waitUntilVisible();

        passfield.sendKeys(RMpass);//fill the resource manager password
        next.waitUntilClickable();
        next.click();
      getDriver().manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);


    }

    public void choosetheprojectdashboard()
    {
        Actions act1 = new Actions(getDriver());
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(clickonprojectdashboard).waitUntilPresent();//wait until project dashboard link is visible

        act1.moveToElement(clickonprojectdashboard).perform();//hover to the project dashboard link

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(clickonprojectdashboard).waitUntilClickable();

        withAction().click(clickonprojectdashboard).perform();//click on that project dashboard link

        withTimeoutOf(40,TimeUnit.SECONDS).waitFor(viewbuttonvisible).waitUntilVisible();


    }


    public void ClickOnTheActionDropDown(DataTable dataTable)
    {
         waitABit(3000);
         List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String value = data.get(0).get("Action");//get the project number value form the datatable suppose if we are using 3 that means we are selecting first number project from the top list
        withAction().click(getDriver().findElement(By.xpath("(//div[@class='v-select__selections'])[" + value + "]"))).perform();//click on that project by using dynamic xpath
       getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
    public void ClickOnTheCreationProject(DataTable dataTable)
    {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String Value1 = data.get(0).get("projectwisecreation");//suppose if we are using 1 value that means we are going to take action on first project which at top place
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list-item v')])[" + Value1 + "]"))).perform();//click on the creation option that are visible after click on the action drop down

        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(DiabledRequestedBY).waitUntilVisible();//wait until Requested by field not visible in the creation form


    }

    public void CheckAllTheWebElements()
    {
        DiabledRequestedBY.isPresent();//Disabled requestedby field is present
        DiabledRequestedOn.isPresent();//Disabled requestedon field is present
        DiabledProjectname.isPresent();//Disabled project name field is present
        DiabledAM.isPresent();//Disabled AM Field is present
        DiabledPM.isPresent();//Disabled PM field is present
        DisabledBillingtype.isPresent();//Disabled Billing type field is present
        DisabledTechnologies.isPresent();//Disabled technology field is present


    }
    public void creationsubmitbutton()
    {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",ClickonCreationSubmit );//scroll down to the creation submit button

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(ClickonCreationSubmit).waitUntilClickable();

        withAction().click(ClickonCreationSubmit).perform();//click on the creation submit button

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(creationpopupmessage).waitUntilVisible();
    }

    public void clickonthecreationpopupmessage()
    {

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(creationpopupmessage).waitUntilClickable();

        withAction().click(creationpopupmessage).perform();//click on the creation pop up message

    }


    public void ClickOnTheRequisitionProject(DataTable dataTable)
    {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String Value1 = data.get(0).get("projectwiserequisition");//suppose if we want to do the requisition for the first project then we have to passed the 1 value
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list-item v')])[" + Value1 + "]"))).perform();//then click on the requisition option as per the project position thats why we are using dynamic xpath

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(AddRequisitionButton).waitUntilVisible();
    }

    public void ClickOnTheRequisitionButton()
    {
        waitABit(3000);
        withAction().click(AddRequisitionButton).perform();//after enter in to the requisition form then click on the add requisition button

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(RequisitionDepartmentField).waitUntilVisible();
    }


    public void FillTheWrongInputInToTheRequisitionNumberOfResourceField(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String Input1 = data.get(0).get("WongInput");//get the value from the datatable
        String Validation1 = data.get(0).get("Validation message");//get the validation message from the datatable
        NumberOfResourcesField.sendKeys(Input1);//fill the wrong input in to the data table

            String msg1 = NumberOFResourceValidation.getText();//get the value through the getetext
            Assert.assertEquals(Validation1, msg1);//then compare it with the actual and expectation

}
public void FillTheWrongInputInToTheRequisitionDailyEffortsField(DataTable dataTable)
{
    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
    String Input2 = data.get(1).get("WongInput");//get the value from the datatable
    String Validation2 = data.get(1).get("Validation message");//get the validation from the datatable
        DailyEffortsField.sendKeys(Input2);//fill the wrong input in to the field


                   String msg2=DailyEffortsValidation.getText();//get the value through the getetext and store it
                   Assert.assertEquals(Validation2,msg2);//comparing the actual and expectation
                }


    public void FillTheWrongInputInToTheRequisitionExperienceField(DataTable dataTable)
       {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String Input3 = data.get(2).get("WongInput");//get the value from datatble
        String Validation3 = data.get(2).get("Validation message");//get the expected validation from the datatable
        ExperienceField.sendKeys(Input3);//fill the wrong input in that field


            String msg3=ExperienceValidation.getText();//get the actual value
            Assert.assertEquals(Validation3,msg3);//comparing the actual and expectation

    }

    public void FillAllTheRequisitionFields(DataTable dataTable)
    {

        withAction().click(RequisitionDepartmentField).perform();//click on the requisition department
        List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
        String SelectDepartment=data.get(0).get("Department");//get the deaprtment value from the datatable
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list-item v-list-item--link theme--light')])["+SelectDepartment+"]"))).perform();//select the department value

       withTimeoutOf(20,TimeUnit.SECONDS).waitFor(RequisitionTechnologyField).waitUntilClickable();

       withAction().click(RequisitionTechnologyField).perform();//click on the requisition technology field
       String SelectTechnology=data.get(0).get("Technology");//get the technology value from the datatable
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list v-select-list v-sheet')])[2]/div[@class='v-list-item v-list-item--link theme--light']["+SelectTechnology+"]"))).perform();//select the technology value

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(RequisitionRoleField).waitUntilClickable();

        withAction().click(RequisitionRoleField).perform();//click on the requisition field
        String SelectRole=data.get(0).get("Role");//get the role value from the datatable
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list v-select-list v-sheet')])[3]/div[@class='v-list-item v-list-item--link theme--light']["+SelectRole+"]"))).perform();//select the role value

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(NumberOfResourcesField).waitUntilClickable();

        withAction().click(NumberOfResourcesField).perform();//click on the resources field
        String SelectNumberofResources=data.get(0).get("NumberofResources");//get the resources value from the datatable
        NumberOfResourcesField.sendKeys(SelectNumberofResources);//fill the resources field by getting value from the datatable


        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(DailyEffortsField).waitUntilClickable();

        withAction().click(DailyEffortsField).perform();//click on the daily effort field
        String SelectDailyEfforts=data.get(0).get("DailyEfforts");//get the value from the datatable for daily effort field
        DailyEffortsField.sendKeys(SelectDailyEfforts);//fill the value in that field

        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(ExperienceField).waitUntilClickable();

        withAction().click(ExperienceField).perform();//click on the experience field
        String SelectExperience=data.get(0).get("Experience");//get the value from the datatable for experience field
        ExperienceField.sendKeys(SelectExperience);//fill the experience field

        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(StartDateField).waitUntilClickable();

        withAction().click(StartDateField).perform();//click on the start date field

        withTimeoutOf(7,TimeUnit.SECONDS).waitFor(StartDateValue).waitUntilClickable();

        withAction().click(StartDateValue).perform();//select the start date value


        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(EndDateField).waitUntilClickable();

        withAction().click(EndDateField).perform();//click on the end date field

        withTimeoutOf(5,TimeUnit.SECONDS).waitFor(EndDateValue).waitUntilClickable();

        withAction().click(EndDateValue).perform();//select the end date value

        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",RequisitionSaveButton );//scroll down to the save button
        withAction().click(RequisitionSaveButton).perform();//click on the save button
    }

    public void RequisitionSubmitButton()
    {
        waitABit(3000);
        withAction().click(ClickOnRequisitionSubmitButton).perform();//click on the requisition submit button
    }

    public void RequisitionPopUp()
    {
       withTimeoutOf(25,TimeUnit.SECONDS).waitFor(ClickOnRequisitionpopupmessage).waitUntilClickable();

        withAction().click(ClickOnRequisitionpopupmessage).perform();//click on the requisition pop up message

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(viewbuttonvisible).waitUntilVisible();



    }

    public void EnterInToEditRequisitionAndVerifyThatEditValues(DataTable dataTable)
    {

        List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
        String EditRequisition=data.get(0).get("projectwiseEditrequisition");
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list-item v-list-item--link theme')])["+EditRequisition+"]"))).perform();//click on the edit requisition option

        withTimeoutOf(25,TimeUnit.SECONDS).waitFor(RequisitionDeleteButton).waitUntilClickable();


        withAction().click(RequisitionDeleteButton).perform();//click on the delete requisition button
        withTimeoutOf(25,TimeUnit.SECONDS).waitFor(CancelItemRequisitionButton).waitUntilVisible();
        String Comparing=data.get(0).get("DeleteItemValidation");
        Assert.assertEquals(Comparing,DeleteItemValidation.getText());//comparing the delete item validation

        withAction().click(CancelItemRequisitionButton).perform();//click on the cancel button of the delete validation message
        withTimeoutOf(25,TimeUnit.SECONDS).waitFor(EditItemRequisitionButton).waitUntilClickable();

        withAction().click(EditItemRequisitionButton).perform();//click on the edit button

       withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditRequisitionDepartmentField).waitUntilVisible();

        EditRequisitionDepartmentField.isDisplayed();//In the Edit Requisition Department field is disbaled and user should verify that whether that field is display or not
        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(EditRequisitionTechnologyField).waitUntilClickable();
        withAction().click(EditRequisitionTechnologyField).perform();//click on the requisition technology field
        String SelectTechnology=data.get(0).get("EditTechnology");//get the technology value from the datatable
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list v-select-list v-sheet v-sheet--t')])[1]/div[@class='v-list-item v-list-item--link theme--light']["+SelectTechnology+"]"))).perform();//select the technology value

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditRequisitionRoleField).waitUntilClickable();

        withAction().click(EditRequisitionRoleField).perform();//click on the requisition field
        String SelectRole=data.get(0).get("EditRole");//get the role value from the datatable
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list v-select-list v-sheet v-sheet--t')])[2]/div[@class='v-list-item v-list-item--link theme--light']["+SelectRole+"]"))).perform();//select the role value

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditNumberOfResourcesField).waitUntilClickable();

        withAction().click(EditNumberOfResourcesField).perform();//click on the resources field
        EditNumberOfResourcesField.sendKeys(Keys.BACK_SPACE);//This statment is use to remove the previous value
        String SelectNumberofResources=data.get(0).get("EditNumberofResources");//get the resources value from the datatable
        EditNumberOfResourcesField.sendKeys(SelectNumberofResources);//fill the resources field by getting value from the datatable

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditDailyEffortsField).waitUntilClickable();

        withAction().click(EditDailyEffortsField).perform();//click on the daily effort field
        EditDailyEffortsField.sendKeys(Keys.BACK_SPACE);
        String SelectDailyEfforts=data.get(0).get("EditDailyEfforts");//get the value from the datatable for daily effort field
        EditDailyEffortsField.sendKeys(SelectDailyEfforts);//fill the value in that field

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditExperienceField).waitUntilClickable();

        withAction().click(EditExperienceField).perform();//click on the experience field
        EditExperienceField.sendKeys(Keys.BACK_SPACE);//This statement
        String SelectExperience=data.get(0).get("EditExperience");//get the value from the datatable for experience field
        EditExperienceField.sendKeys(SelectExperience);//fill the experience field

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditRequisitionSaveButton).waitUntilClickable();

        withAction().click(EditRequisitionSaveButton).perform();//click on the save button

            Assert.assertEquals("Business Development", EditRequisitionRolevalue.getText());//comparing the role value after edit the requisition
            Assert.assertEquals("Php - Symfony",EditRequisitionTechnologyvalue.getText());//comparing the Technology value after edit the requisition
            Assert.assertEquals(SelectNumberofResources,EditRequisitionNumberofResourcevalue.getText());//comparing the number of resources value after edit the requisition
            Assert.assertEquals(SelectDailyEfforts,EditRequisitionDailyEffortsvalue.getText());//comparing the daily efforts  value after edit the requisition
            Assert.assertEquals(SelectExperience,EditRequisitionExperiencevalue.getText());//comparing the experience value after edit the requisition
            Assert.assertEquals("May 6, 2020",EditRequisitionstartdatevalue.getText());//comparing the start date value after edit the requisition
            Assert.assertEquals("May 20, 2020",EditRequisitionenddatevalue.getText());//comparing the end date value after edit the requisition

            withTimeoutOf(15,TimeUnit.SECONDS).waitFor(EditRequisitionsubmitbutton).waitUntilClickable();

            withAction().click(EditRequisitionsubmitbutton).perform();//click on the submit button

            withTimeoutOf(25,TimeUnit.SECONDS).waitFor(okpopup).waitUntilClickable();

            popup();//recall the popup method

    }

    public void FillTheBUusernameandpassword(String BUuser, String BUpass)
    {
        setLogin();//recall that method
       getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            getDriver().switchTo().window(itr.next());
        }

       withTimeoutOf(25, TimeUnit.SECONDS).waitFor(userfield).waitUntilVisible();

        userfield.sendKeys(BUuser);//fill the resource manager user
        next.click();

        withTimeoutOf(25,TimeUnit.SECONDS).waitFor(passfield).waitUntilVisible();

        passfield.sendKeys(BUpass);//fill the resource manager password
        next.click();
        waitABit(4000);


    }

    public void AllocationOption(DataTable dataTable)
    {

        withTimeoutOf(25,TimeUnit.SECONDS).waitForText(BillingText.getText());//wait for billing type text along with the projects

        List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
        String Allocation=data.get(0).get("projectwiseAllocation");//user get the value from the data table to perform allocation action on which project
      withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list-item v-list-item--link theme--light')])["+Allocation+"]"))).perform();//here we are using dynamic xpath in which user able to perform allocation action project wise  by changing value from the data table

        withTimeoutOf(25,TimeUnit.SECONDS).waitFor(AllocateButton).waitUntilPresent();//wait unitl allocate button not visible

    }

    public void PartiallyAllocation(DataTable dataTable)
    {

         waitABit(4000);
        Assert.assertEquals("2",EditRequisitionNumberofResourcevalue.getText());//comparing the number of resources value after edit the requisition in the allocation section
        Assert.assertEquals("3",EditRequisitionDailyEffortsvalue.getText());//comparing the daily efforts  value after edit the requisition in the allocation section
        Assert.assertEquals("5",EditRequisitionExperiencevalue.getText());//comparing the experience value after edit the requisition in the allocation section
        Assert.assertEquals("May 6, 2020",EditRequisitionstartdatevalue.getText());//comparing the start date value after edit the requisition in the allocation section
        Assert.assertEquals("May 20, 2020",EditRequisitionenddatevalue.getText());//comparing the end date value after edit the requisition in the allocation section

        for (int i=1;i<=2;i++)//here we are using loop to perform action multiple times
        {
            withAction().click(AllocateButton).perform();//click on the allocate button
            waitABit(1000);
        }
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",AllocationBackButton);//It will scoll down to destination Webelement

        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(DailyEffortsField).waitUntilClickable();//wait until Daily effort field is not clcikable

        withAction().click(DailyEffortsField).perform();//click on the daily effort field
        DailyEffortsField.sendKeys(Keys.BACK_SPACE);//it will remove the value
        List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
        String LatestDailyEfforts=data.get(0).get("Allocation Daily Efforts");//get the updated value from the datatable
        DailyEffortsField.sendKeys(LatestDailyEfforts);//send the updated value in the daily effort field

        withAction().click(FirstAllocationResourceName).perform();//click on the first resource name field
        String FirstResourceName=data.get(0).get("First Resource");//get the value fromn the data table of resource value
       withAction().click( getDriver().findElement(By.xpath("(//div[@class='v-list-item v-list-item--link theme--light'])["+FirstResourceName+"]"))).perform();//click on the resource name which user get from the datatable

       withAction().click(SecondAllocationResourceName).perform();//click on the first resource name field
       String SecondResourceName=data.get(0).get("Second Resource");//get the value fromn the data table of resource value
       withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list v-select-list v-sheet v-sheet')])[2]/div[@class='v-list-item v-list-item--link theme--light']["+SecondResourceName+"]"))).perform();//click on the resource name which user get from the datatable

       withAction().click(AllocationSubmitButton).perform();//click on the allocation submit button
       withTimeoutOf(25,TimeUnit.SECONDS).waitFor(PartialAllocationValidation).waitUntilVisible();//wait for validation text
       String PartiallyValidation=data.get(0).get("partial validation");//get the validation text from the data table
       Assert.assertEquals(PartiallyValidation,PartialAllocationValidation.getText());//here we are text is correct or not

       withTimeoutOf(15,TimeUnit.SECONDS).waitFor(YesButtonOfValidation).waitUntilClickable();//wait until yes buuton of validation is not clickable

       withAction().click(YesButtonOfValidation).perform();//click on the yes validsation button

       withTimeoutOf(20,TimeUnit.SECONDS).waitFor(Allocationokpop).waitUntilClickable();//wait until ok of pop up not clickable

       withAction().click(Allocationokpop).perform();//click on the ok button of pop up message
       getDriver().close();//here we are clcose the window
    }

    public void Clickontheacceptdeclineoptionandperformactionsonit()
    {
        waitABit(2000);
        withAction().click(AcceptDeclineoption).perform();//click on the accept decline option from the action drop down

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(Approveicon).waitUntilClickable();//wait until approve icon not clickable

        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);",AcceptDeclineBackButton);//scroll down to the destination webelement

       for (int i=1;i<=2;i++)//here we are using loop to perform multiple actions
        {
           getDriver().findElement(By.xpath("(//button[contains(@class,'v-icon notranslate mdi-24px red--')])[1]")).click();//click on the decline icon
           waitABit(5000);
        }
        Assert.assertEquals("Declined",DeclineStatusOne.getText());//comparing the decline status of first resource
        Assert.assertEquals("Declined",DeclineStatusTwo.getText());//comparing the decline status of second resource


        withAction().click(AcceptDeclineBackButton).perform();//click on the back button
        getDriver().close();//here we are clcose the window
    }
    public void ClickonAllocationSubmitButton()
    {

        waitABit(4000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",AllocationBackButton);

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(AllocationSubmitButton).waitUntilClickable();

        withAction().click(AllocationSubmitButton).perform();

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(YesButtonOfValidation).waitUntilClickable();

        withAction().click(YesButtonOfValidation).perform();//click on the yes button of validation message

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(Allocationokpop).waitUntilClickable();

        withAction().click(Allocationokpop).perform();//click on the ok button of pop up message
        getDriver().close();
    }

    public void ClickontheacceptdeclineoptionandperformApproveactionsonit()
    {
        waitABit(2000);
        withAction().click(AcceptDeclineoption).perform();//click on the accept decline option from the action drop down

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(Approveicon).waitUntilClickable();//wait until approve icon is not clickable

        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", AcceptDeclineBackButton);//scroll down to the back button

          for (int i=1;i<=2;i++)//here we are using to perform multiple actions
          {
              getDriver().findElement(By.xpath("(//button[contains(@class,'v-icon notranslate mdi-24px green--text v-icon--link')])[1]")).click();//click on the approve icon
              waitABit(4000);

          }

          Assert.assertEquals("Approved",ApprovedStatusOne.getText());//approve status visible of first resource after click on the approve icon
          Assert.assertEquals("Approved",ApprovedStatusTwo.getText());//approve status visible of second resource after click on the approve icon


         withAction().click(AcceptDeclineBackButton).perform();//click on the back button
          getDriver().close();//close the window

    }

    public void ClickOnTheResourceMappingOption()
    {
       waitABit(2000);
        withAction().click(MappingOptionVisible).perform();//click on the mapping option

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(DiabledRequestedBY).waitUntilVisible();//user is not bale to enter in to the mapping form until requested by field not visible

        waitABit(2000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",MappingSubmitButton );//scroll down to submit button

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(MappingSubmitButton).waitUntilClickable();

        withAction().click(MappingSubmitButton).perform();//click on the mapping submit button

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(okpopup).waitUntilClickable();

        withAction().click(okpopup).perform();//click on the ok button of pop up

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(logout).waitUntilVisible();

        withAction().click(logout).perform();//click on the logout button
        getDriver().close();//close the window


    }

    public void Afterclickonprojectdashboard()
    {
        Actions act1 = new Actions(getDriver());

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(clickonprojectdashboard).waitUntilPresent();//wait until project dashboard link is visible

        act1.moveToElement(clickonprojectdashboard).perform();//hover to the project dashboard link

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(clickonprojectdashboard).waitUntilClickable();//wait until project dashboard link is not clickable

        withAction().click(clickonprojectdashboard).perform();//click on that project dashboard link
        waitABit(14000);

    }

    public void FullyAllocation(DataTable dataTable)
    {
        waitABit(4000);
        Assert.assertEquals("2",EditRequisitionNumberofResourcevalue.getText());//comparing the number of resources value after edit the requisition in the allocation section
        Assert.assertEquals("3",EditRequisitionDailyEffortsvalue.getText());//comparing the daily efforts  value after edit the requisition in the allocation section
        Assert.assertEquals("5",EditRequisitionExperiencevalue.getText());//comparing the experience value after edit the requisition in the allocation section
        Assert.assertEquals("May 6, 2020",EditRequisitionstartdatevalue.getText());//comparing the start date value after edit the requisition in the allocation section
        Assert.assertEquals("May 20, 2020",EditRequisitionenddatevalue.getText());//comparing the end date value after edit the requisition in the allocation section


        for (int i=1;i<=2;i++)//here we are using loop to perform action multiple times
        {
            withAction().click(AllocateButton).perform();//click on the allocate button
            waitABit(1000);
        }
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",AllocationBackButton);//It will scoll down to destination Webelement
        List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
        withAction().click(FirstAllocationResourceName).perform();//click on the first resource name field
        String FirstResourceName=data.get(0).get("First Resource");//get the value fromn the data table of resource value
        withAction().click( getDriver().findElement(By.xpath("(//div[@class='v-list-item v-list-item--link theme--light'])["+FirstResourceName+"]"))).perform();//click on the resource name which user get from the datatable

        withAction().click(SecondAllocationResourceName).perform();//click on the first resource name field
        String SecondResourceName=data.get(0).get("Second Resource");//get the value fromn the data table of resource value
        withAction().click(getDriver().findElement(By.xpath("(//div[contains(@class,'v-list v-select-list v-sheet v-sheet')])[2]/div[@class='v-list-item v-list-item--link theme--light']["+SecondResourceName+"]"))).perform();//click on the resource name which user get from the datatable

        withAction().click(AllocationSubmitButton).perform();//click on the allocation submit button

        withTimeoutOf(20,TimeUnit.SECONDS).waitFor(FullyAllocationokpop).waitUntilClickable();//wait until ok of pop up not clickable

        withAction().click(FullyAllocationokpop).perform();//click on the ok button of pop up message
        getDriver().close();//here we are close the window
    }
}





