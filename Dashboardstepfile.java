package net.automation.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.automation.pages.Dashboardpagefile;
import net.automation.pages.Google;
import utilities.LoadProperties;

public class Dashboardstepfile
{
    LoadProperties loadproperties;
    Google google;
    Dashboardpagefile dashboardpagefile;
    @And("^click on the login button$")
    public void clickOnTheLoginButton()
    {
        google.goToHomePage();
        dashboardpagefile.setLogin();
    }

    @And("^Fill the \"([^\"]*)\" and \"([^\"]*)\"in field$")
    public void fillTheAndInField(String user, String pass)
    {

       user= loadproperties.getValueFromPropertyFile("test_data",user);
       pass=loadproperties.getValueFromPropertyFile("test_data",pass);
       dashboardpagefile.setuserpassfiled(user,pass);



    }

    @Then("^initiation option visible or not and \"([^\"]*)\"$")
    public void initiationOptionVisibleOrNotAnd(String initiation)
    {
        dashboardpagefile.initiationoption(initiation);

    }


    @And("^I check edit button visible to GO/Sales$")
    public void iCheckEditButtonVisibleToGOSales()
    {
                dashboardpagefile.Editbutton();
    }

    @Then("^click on the logout button$")
    public void clickOnTheLogoutButton()
    {
        dashboardpagefile.setLogout();
    }


    @And("^I fill the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iFillTheUsernameAsAndPasswordAs(String userargs, String passargs)
    {
        google.goToHomePage();
        userargs=loadproperties.getValueFromPropertyFile("test_data",userargs);
        passargs=loadproperties.getValueFromPropertyFile("test_data",passargs);
        dashboardpagefile.FillGOuserpassword(userargs,passargs);


    }

    @When("^I click on the submit button$")
    public void iClickOnTheSubmitButton()
    {
        dashboardpagefile.submit();
    }

    @Then("^I click on the pop up message$")
    public void iClickOnThePopUpMessage()
    {
        dashboardpagefile.popup();

    }

    @When("^I click on the project initiation option from the Menu$")
    public void iClickOnTheProjectInitiationOptionFromTheMenu()
    {
        dashboardpagefile.ChooseTheInitiationOption();
    }


    @Then("^I Fill the Fields input and verify the validation message in the Initiation form$")
    public void iFillTheFieldsInputAndVerifyTheValidationMessageInTheInitiationForm(DataTable dataTable)
    {
        dashboardpagefile.GivingWrongInputInTheFields(dataTable);
    }


    @And("^I use username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iUseUsernameAsAndPasswordAs(String RMuser, String RMpass)
    {
       google.goToHomePage();
        RMuser=loadproperties.getValueFromPropertyFile("test_data",RMuser);
        RMpass=loadproperties.getValueFromPropertyFile("test_data",RMpass);
        dashboardpagefile.RMusernameandpassword(RMuser,RMpass);

    }

    @When("^I click on the open request of project dashboard$")
    public void iClickOnTheOpenRequestOfProjectDashboard()
    {
        dashboardpagefile.choosetheprojectdashboard();


    }

    @Then("^I verify creation option visible and then click on that option$")
    public void iVerifyCreationOptionVisibleAndThenClickOnThatOption(DataTable dataTable)
    {
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.ClickOnTheCreationProject(dataTable);
    }

    @And("^I enter in to the creation form$")
    public void iEnterInToTheCreationForm()
    {
        dashboardpagefile.CheckAllTheWebElements();
    }

    @Then("^click on the submit button and check pop message display$")
    public void clickOnTheSubmitButtonAndCheckPopMessageDisplay()
    {
        dashboardpagefile.creationsubmitbutton();
        dashboardpagefile.clickonthecreationpopupmessage();
    }


    @Then("^I Click On The Requisition option$")
    public void iClickOnTheRequisitionOption(DataTable dataTable)
    {

        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.ClickOnTheRequisitionProject(dataTable);


    }


    @Then("^Enter In To The Requisition Form and Fill The WongInput In The Fields And Verify It$")
    public void enterInToTheRequisitionFormAndFillTheWongInputInTheFieldsAndVerifyIt(DataTable dataTable)
    {

        dashboardpagefile.ClickOnTheRequisitionButton();
        dashboardpagefile.FillTheWrongInputInToTheRequisitionNumberOfResourceField(dataTable);
        dashboardpagefile.FillTheWrongInputInToTheRequisitionDailyEffortsField(dataTable);
        dashboardpagefile.FillTheWrongInputInToTheRequisitionExperienceField(dataTable);

    }

    @Then("^I Fill The Fields In to The Requisition Form$")
    public void iFillTheFieldsInToTheRequisitionForm(DataTable dataTable)
    {
        dashboardpagefile.ClickOnTheRequisitionButton();
        dashboardpagefile.FillAllTheRequisitionFields(dataTable);
    }

    @When("^I click On The Requisition Submit Button$")
    public void iClickOnTheRequisitionSubmitButton()
    {
        dashboardpagefile.RequisitionSubmitButton();
    }

    @Then("^I submit The Pop Up Message$")
    public void iSubmitThePopUpMessage()
    {
        dashboardpagefile.RequisitionPopUp();
    }


    @And("^project dashboard option visible or not and \"([^\"]*)\"$")
    public void projectDashboardOptionVisibleOrNotAnd(String projectdashboard)
    {
        dashboardpagefile.ProjectDashboardOption(projectdashboard);

    }

    @And("^Resource dashboard option visible or not and \"([^\"]*)\"$")
    public void resourceDashboardOptionVisibleOrNotAnd(String resourcedashboard)
    {
       dashboardpagefile.ResourceDashboardOption(resourcedashboard);
    }

    @Then("^I click on the menu option$")
    public void iClickOnTheMenuOption()
    {
        dashboardpagefile.LeftPanelMenuoption();
    }

    @Then("^I Fill The All Fields In the Initiation Form$")
    public void iFillTheAllFieldsInTheInitiationForm(DataTable dataTable)
    {
        dashboardpagefile.filltheinitiationform(dataTable);

    }

    @And("^I repeate the Initiation scenario with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iRepeateTheInitiationScenarioWithAnd(String userargs, String passargs,DataTable dataTable)
    {
        google.goToHomePage();
        userargs=loadproperties.getValueFromPropertyFile("test_data",userargs);
        passargs=loadproperties.getValueFromPropertyFile("test_data",passargs);
        dashboardpagefile.FillGOuserpassword(userargs,passargs);

        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.ChooseTheInitiationOption();
        dashboardpagefile.filltheinitiationform(dataTable);
        dashboardpagefile.submit();
        dashboardpagefile.popup();
        dashboardpagefile.setLogout();

    }

    @And("^I repeate the creation scenario with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iRepeateTheCreationScenarioWithAnd(String RMuser, String RMpass,DataTable dataTable)
    {
        google.goToHomePage();
        RMuser=loadproperties.getValueFromPropertyFile("test_data",RMuser);
        RMpass=loadproperties.getValueFromPropertyFile("test_data",RMpass);
        dashboardpagefile.RMusernameandpassword(RMuser,RMpass);
        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.choosetheprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.ClickOnTheCreationProject(dataTable);
        dashboardpagefile.CheckAllTheWebElements();
        dashboardpagefile.creationsubmitbutton();
        dashboardpagefile.clickonthecreationpopupmessage();
        dashboardpagefile.setLogout();
    }

    @Then("^I check User Able To Edit The Requisition And Verify It$")
    public void iCheckUserAbleToEditTheRequisitionAndVerifyIt(DataTable dataTable)
    {
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.EnterInToEditRequisitionAndVerifyThatEditValues(dataTable);

    }

    @And("^I repeate Requisition and Edit Requisition with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iRepeateRequisitionAndEditRequisitionWithAnd(String userargs, String passargs,DataTable dataTable)
    {
        google.goToHomePage();
        userargs=loadproperties.getValueFromPropertyFile("test_data",userargs);
        passargs=loadproperties.getValueFromPropertyFile("test_data",passargs);
        dashboardpagefile.FillGOuserpassword(userargs,passargs);
        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.choosetheprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.ClickOnTheRequisitionProject(dataTable);
        dashboardpagefile.ClickOnTheRequisitionButton();
        dashboardpagefile.FillAllTheRequisitionFields(dataTable);
        dashboardpagefile.RequisitionSubmitButton();
        dashboardpagefile.RequisitionPopUp();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.EnterInToEditRequisitionAndVerifyThatEditValues(dataTable);
        dashboardpagefile.setLogout();


    }

    @Then("^I Fill username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iFillUsernameAsAndPasswordAs(String BUuser, String BUpass)
    {
        google.goToHomePage();
        BUuser=loadproperties.getValueFromPropertyFile("test_data",BUuser);
        BUpass=loadproperties.getValueFromPropertyFile("test_data",BUpass);
        dashboardpagefile.FillTheBUusernameandpassword(BUuser,BUpass);

    }


    @Then("^I Click On The Allocation option and allocate the resources$")
    public void iClickOnTheAllocationOptionAndAllocateTheResources(DataTable dataTable)
    {
        dashboardpagefile.Afterclickonprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.AllocationOption(dataTable);
        dashboardpagefile.PartiallyAllocation(dataTable);

    }

    @And("^I check accept decline option visible with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckAcceptDeclineOptionVisibleWithAnd(String userargs,String passargs,DataTable dataTable)
    {
        google.goToHomePage();
        userargs=loadproperties.getValueFromPropertyFile("test_data",userargs);
        passargs=loadproperties.getValueFromPropertyFile("test_data",passargs);
        dashboardpagefile.FillGOuserpassword(userargs,passargs);

        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.choosetheprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.Clickontheacceptdeclineoptionandperformactionsonit();


    }

    @And("^I Reallocate the resources with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iReallocateTheResourcesWithUsernameAsAndPasswordAs(String BUuser, String BUpass,DataTable dataTable)
    {
        google.goToHomePage();
        BUuser=loadproperties.getValueFromPropertyFile("test_data",BUuser);
        BUpass=loadproperties.getValueFromPropertyFile("test_data",BUpass);
        dashboardpagefile.FillTheBUusernameandpassword(BUuser,BUpass);
        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.Afterclickonprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.AllocationOption(dataTable);
        dashboardpagefile.ClickonAllocationSubmitButton();


    }

    @Then("^I approve All  the resources in the accept decline form with username as\"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void iApproveAllTheResourcesInTheAcceptDeclineFormWithUsernameAsAndPasswordAs(String userargs, String passargs,DataTable dataTable)
    {
        google.goToHomePage();
        userargs=loadproperties.getValueFromPropertyFile("test_data",userargs);
        passargs=loadproperties.getValueFromPropertyFile("test_data",passargs);
        dashboardpagefile.FillGOuserpassword(userargs,passargs);
        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.choosetheprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.ClickontheacceptdeclineoptionandperformApproveactionsonit();

    }


    @Then("^I check Mapping option visible with \"([^\"]*)\" and \"([^\"]*)\" and submit The Mapping Form$")
    public void iCheckMappingOptionVisibleWithAndAndSubmitTheMappingForm(String RMuser, String RMpass,DataTable dataTable)
    {
        google.goToHomePage();
        RMuser=loadproperties.getValueFromPropertyFile("test_data",RMuser);
        RMpass=loadproperties.getValueFromPropertyFile("test_data",RMpass);
        dashboardpagefile.RMusernameandpassword(RMuser,RMpass);
        dashboardpagefile.LeftPanelMenuoption();
        dashboardpagefile.choosetheprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.ClickOnTheResourceMappingOption();


    }

    @Then("^I click on the Allocation option and allocate fully resources$")
    public void iClickOnTheAllocationOptionAndAllocateFullyResources(DataTable dataTable)
    {
        dashboardpagefile.Afterclickonprojectdashboard();
        dashboardpagefile.ClickOnTheActionDropDown(dataTable);
        dashboardpagefile.AllocationOption(dataTable);
        dashboardpagefile.FullyAllocation(dataTable);

    }
}
