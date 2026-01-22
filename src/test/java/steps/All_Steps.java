package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.SignInPage;

import static testUtils.WebDriverUtils.driver;

import pages.StudentPage;
import testUtils.CommonMethods;
import testUtils.Constants;
import testUtils.CucumberLogUtils;

import java.util.UUID;

public class All_Steps {

    SignInPage signInPage = new SignInPage();
    DashboardPage dashboardPage = new DashboardPage();
    StudentPage studentPage = new StudentPage();

    @Given("a CTSMS user is on the login page {string}")
    public void a_ctsms_user_is_on_the_login_page(String url) {
        driver.get(url);
        CucumberLogUtils.logScreenshot();
        System.out.println(" ****** SOMETHING PRINTED HERE ******* ");
        CucumberLogUtils.scenario.log("****** SOMETHING PRINTED HERE *******");
    }

    @When("the user logs in with valid credentials {string}, {string}")
    public void the_user_logs_in_with_valid_credentials(String username, String password) {
        signInPage.usernameTextBox.sendKeys(username);
        signInPage.passwordTextBox.sendKeys(password);
        signInPage.signInButton.click();
    }

    @Then("user is directed to the landing page")
    public void user_is_directed_to_the_landing_page() {
        CommonMethods.waitForURLToBe(10, "https://chromatech-test-lms.com/admin/admin/dashboard");
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, "https://chromatech-test-lms.com/admin/admin/dashboard");
    }

    @And("the user is on the student admission page")
    public void theUserIsOnTheStudentAdmissionPage() {
        dashboardPage.studentInformationMenu.click();
        dashboardPage.studentAdmissionMenu.click();
    }

    @And("enters student admission number")
    public void aUserFillsInTheStudentAdmissionNumber() {
        studentPage.admissionNoTextBox.clear();
        studentPage.admissionNoTextBox.sendKeys(CommonMethods.getCurrentDateWithFormat());
    }

    @And("enters student roll number")
    public void aUserFillsInTheStudentRollNumber() {
        String rollNo = UUID.randomUUID().toString().substring(0,8);
        studentPage.rollNoTextBox.sendKeys(rollNo);
    }

    @And("selects {string} from the class dropdown")
    public void selectsFromTheClassDropdown(String className) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.classDropDown, className);
        CucumberLogUtils.logScreenshot();
    }

    @And("selects {string} from the section dropdown")
    public void selectsFromTheSectionDropdown(String sectionName) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.sectionDropDown, sectionName);
        CucumberLogUtils.logScreenshot();
    }

    @And("enters student first name {string}")
    public void entersStudentFirstName(String firstName) {
        studentPage.firstNameTextBox.sendKeys(firstName);
        CucumberLogUtils.logScreenshot();
    }

    @And("enters student last name {string}")
    public void entersStudentLastName(String lastName) {
        studentPage.lastNameTextBox.sendKeys(lastName);
    }

    @And("selects {string} from the gender option")
    public void selectsFromTheGenderOption(String gender) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.genderDropDown, gender);
    }

    @And("enters student date of birth {string}")
    public void entersStudentDateOfBirth(String dateOfBirth) {
        CommonMethods.selectDateByJS(studentPage.dobDatePicker, dateOfBirth);
    }

    @And("selects {string} from the Category dropdown")
    public void selectsFromTheCategoryDropdown(String category) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.categoryDropDown,category);
    }

    @And("enters student email {string}")
    public void entersStudentEmail(String emailAddress) {
        studentPage.emailTextBox.sendKeys(emailAddress);
    }

    @And("enters Admission date {string}")
    public void entersAdmissionDate(String admissionDate) {
        CommonMethods.selectDateByJS(studentPage.admissionDatePicker, admissionDate);
    }

    @And("uploads student photo {string}")
    public void uploadsStudentPhotoFrom(String studentPhotoPath) {
        studentPage.studentPhotoFilePicker.sendKeys(Constants.STUDENT_PHOTO_PATH);
    }

    @And("selects {string} from Blood Group dropdown")
    public void selectsFromBloodGroupDropdown(String bloodGroup) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.bloodGroupDropDown, bloodGroup);
    }

    @And("enters As on date {string}")
    public void entersAsOnDate(String asOnDate) {
        CommonMethods.selectDateByJS(studentPage.asOnDateDatePicker, asOnDate);
    }

    @And("clicks on Add Sibling button")
    public void clicksOnAddSiblingButton() {
        studentPage.addSiblingButton.click();
    }

    @And("selects {string} from sibling Class dropdown")
    public void selectsFromSiblingClassDropdown(String siblingClass) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.siblingClassDropDown, siblingClass);
    }

    @And("selects {string} from sibling Section dropdown")
    public void selectsFromSiblingSectionDropdown(String siblingSection) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.siblingSectionDropDown, siblingSection);
    }

    @And("enters sibling Student ID {string}")
    public void entersSiblingStudentID(String siblingStudentID) {
        CommonMethods.selectDropDownValueByVisibleText(studentPage.siblingStudentIDDropDown, siblingStudentID);
    }

    @And("enters a mobile number {string} in Mobile Number textbox")
    public void entersAMobileNumberInMobileNumberTextbox(String mobileNumber) {
        studentPage.mobileNumberTextBox.sendKeys(mobileNumber);
    }

    @And("clicks on Add button")
    public void clicksOnAddButton() {
        studentPage.addSiblingConfirmButton.click();
    }

    @And("enters height {string} in Height textbox")
    public void entersHeightInHeightTextbox(String height) {
        studentPage.heightTextBox.sendKeys(height);
    }

    @And("enters weight {string} in Weight textbox")
    public void entersWeightInWeightTextbox(String weight) {
        studentPage.weightTextBox.sendKeys(weight);
    }

    @And("enters father name {string} in Father's Name textbox")
    public void entersFatherNameInFatherSNameTextbox(String fathersName) {
        studentPage.fatherNameTextBox.sendKeys(fathersName);
    }

    @And("enters father phone number {string} in Father's Phone Number textbox")
    public void entersFatherPhoneNumberInFatherSPhoneNumberTextbox(String fathersPhoneNumber) {
        studentPage.fatherPhoneTextBox.sendKeys(fathersPhoneNumber);
    }

    @And("enters father occupation {string} in Father's Occupation textbox")
    public void entersFatherOccupationInFatherSOccupationTextbox(String fathersOccupation) {
        studentPage.fatherOccupationTextBox.sendKeys(fathersOccupation);
    }

    @And("selects father photo from {string}")
    public void selectsFatherPhotoFrom(String fathersPhotoPath) {
        studentPage.fatherPhotoFilePicker.sendKeys(System.getProperty("user.dir") + fathersPhotoPath);
    }

    @And("enters mother name {string} in Mother's Name textbox")
    public void entersMotherNameInMotherSNameTextbox(String mothersName) {
        studentPage.motherNameTextBox.sendKeys(mothersName);
    }

    @And("enters mother phone number {string} in Mother's Phone Number textbox")
    public void entersMotherPhoneNumberInMotherSPhoneNumberTextbox(String mothersPhoneNumber) {
        studentPage.motherPhoneTextBox.sendKeys(mothersPhoneNumber);
    }

    @And("enters mother occupation {string} in Mother's Occupation textbox")
    public void entersMotherOccupationInMotherSOccupationTextbox(String mothersOccupation) {
        studentPage.motherOccupationTextBox.sendKeys(mothersOccupation);
    }

    @And("selects mother photo from {string}")
    public void selectsMotherPhotoFrom(String mothersPhotoPath) {
        studentPage.motherPhotoFilePicker.sendKeys(System.getProperty("user.dir") + mothersPhotoPath);
    }

    @And("selects mother for guardian option")
    public void selectsMotherForGuardianOption() {
        studentPage.motherGuardianRadioButton.click();
    }

    @And("enters guardian email {string} in Guardian's Email textbox")
    public void entersGuardianEmailInGuardianSEmailTextbox(String mothersEmail) {
        studentPage.guardianEmailTextBox.sendKeys(mothersEmail);
    }

    @And("selects guardian photo from {string}")
    public void selectsGuardianPhotoFrom(String mothersPhotoPath) {
        studentPage.guardianPicTextBox.sendKeys(System.getProperty("user.dir") + mothersPhotoPath);
    }

    @And("enters guardian address {string} in Guardian's Address textbox")
    public void entersGuardianAddressInGuardianSAddressTextbox(String guardianAddress) {
        studentPage.guardianAddressTextBox.sendKeys(guardianAddress);
    }

    @And("clicks on Add Detail button")
    public void clicksOnAddDetailButton() {
        studentPage.addDetailButton.click();
    }

    @And("clicks on guardian same as current address checkbox")
    public void clicksOnGuardianSameAsCurrentAddressCheckbox() {
        studentPage.addressCheckBox.click();
    }

    @And("enters account number {string} in Bank Account Number textbox")
    public void entersAccountNumberInBankAccountNumberTextbox(String bankAccountNumber) {
        studentPage.bankAccountNoTextBox.sendKeys(bankAccountNumber);
    }

    @And("enters bank name {string} in Bank Name textbox")
    public void entersBankNameInBankNameTextbox(String bankName) {
        studentPage.bankNameTextBox.sendKeys(bankName);
    }

    @And("enters IFSC code {string} in IFSC Code textbox")
    public void entersIFSCCodeInIFSCCodeTextbox(String ifscCode) {
        studentPage.ifscCodeTextBox.sendKeys(ifscCode);
    }

    @And("enters national ID number {string} in PAN Number textbox")
    public void entersNationalIDNumberInPANNumberTextbox(String nationalIDNumber) {
        studentPage.nationalIDTextBox.sendKeys(nationalIDNumber);
    }

    @And("enters local ID number {string} in Local ID Number textbox")
    public void entersLocalIDNumberInLocalIDNumberTextbox(String localIDNumber) {
        studentPage.localIDTextBox.sendKeys(localIDNumber);
    }

    @And("clicks yes on RTE radio button")
    public void clicksYesOnRTERadioButton() {
        studentPage.rteRadioButtonYes.click();
    }

    @And("enters previous school details {string} in Previous School Details textbox")
    public void entersPreviousSchoolDetailsInPreviousSchoolDetailsTextbox(String previousSchoolDetails) {
        studentPage.previousSchoolTextBox.sendKeys(previousSchoolDetails);
    }

    @And("enters note {string} in Note textbox")
    public void entersNoteInNoteTextbox(String additionalNotes) {
        studentPage.noteTextBox.sendKeys(additionalNotes);
    }

    @And("enters first title {string} in First Title textbox")
    public void entersFirstTitleInFirstTitleTextbox(String firstTitle) {
        studentPage.firstTitleTextBox.sendKeys(firstTitle);

    }

    @And("selects document from {string} in First Document textbox")
    public void selectsDocumentFromInFirstDocumentTextbox(String firstDocumentPath) {
        studentPage.firstDocumentFilePicker.sendKeys(System.getProperty("user.dir") + firstDocumentPath);
    }

    @And("enters second title {string} in Second Title textbox")
    public void entersSecondTitleInSecondTitleTextbox(String secondTitle) {
        studentPage.secondTitleTextBox.sendKeys(secondTitle);

    }

    @And("selects document from {string} in Second Document textbox")
    public void selectsDocumentFromInSecondDocumentTextbox(String secondDocumentPath) {
        studentPage.secondDocumentFilePicker.sendKeys(System.getProperty("user.dir") + secondDocumentPath);
    }

    @And("enters fourth title {string} in Fourth Title textbox")
    public void entersFourthTitleInFourthTitleTextbox(String fourthTitle) {
        studentPage.fourthTitleTextBox.sendKeys(fourthTitle);
    }

    @And("selects document from {string} in Fourth Document textbox")
    public void selectsDocumentFromInFourthDocumentTextbox(String fourthDocumentPath) {
        studentPage.fourthDocumentFilePicker.sendKeys(System.getProperty("user.dir") + fourthDocumentPath);
    }

    @And("enters fifth title {string} in Fifth Title textbox")
    public void entersFifthTitleInFifthTitleTextbox(String fifthTitle) {
        studentPage.fifthTitleTextBox.sendKeys(fifthTitle);
    }

    @And("selects document from {string} in Fifth Document textbox")
    public void selectsDocumentFromInFifthDocumentTextbox(String fifthDocumentPath) {
        studentPage.fifthDocumentFilePicker.sendKeys(System.getProperty("user.dir") + fifthDocumentPath);
    }

    @And("clicks on Save button")
    public void clicksOnSaveButton() {
        studentPage.saveButton.click();
    }

    @Then("a new student record is created successfully")
    public void aNewStudentRecordIsCreatedSuccessfully() {
        String actualMessageText = studentPage.successMessage.getText();
        String expectedMessage = "Record Saved Successfully";
        Assert.assertEquals(actualMessageText, expectedMessage, "Expected success message not found.");
        CucumberLogUtils.logScreenshot();
        System.out.println(" New student record created successfully ");
    }
}
