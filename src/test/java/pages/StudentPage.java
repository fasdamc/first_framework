package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testUtils.WebDriverUtils.driver;

public class StudentPage {

    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextBox;

    @FindBy(xpath = "//input[@name='roll_no']")
    public WebElement rollNoTextBox;

    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dobDatePicker;

    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement categoryDropDown;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='admission_date']")
    public WebElement admissionDatePicker;

    @FindBy(xpath = "//input[@name='file']")
    public WebElement studentPhotoFilePicker;

    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath = "//input[@name='measure_date']")
    public WebElement asOnDateDatePicker;

    @FindBy(xpath = "//button[normalize-space()='Add Sibling']")
    public WebElement addSiblingButton;

    @FindBy(xpath = "//select[@name='sibiling_class_id']")
    public WebElement siblingClassDropDown;

    @FindBy(xpath = "//select[@name='sibiling_section_id']")
    public WebElement siblingSectionDropDown;

    @FindBy(xpath = "//select[@name='sibiling_student_id']")
    public WebElement siblingStudentIDDropDown;

    @FindBy(xpath = "//button[@class='btn btn-primary add_sibling']")
    public WebElement addSiblingConfirmButton;

    @FindBy(css = "input[name='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    @FindBy(css = "input[name='custom_fields[students][2]']")
    public WebElement heightTextBox;

    @FindBy(css = "input[name='custom_fields[students][3]']")
    public WebElement weightTextBox;

    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement fatherNameTextBox;

    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement fatherPhoneTextBox;

    @FindBy(xpath = "//input[@name='father_occupation']")
    public WebElement fatherOccupationTextBox;

    @FindBy(xpath = "//input[@name='father_pic']")
    public WebElement fatherPhotoFilePicker;

    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement motherNameTextBox;

    @FindBy(xpath = "//input[@name='mother_phone']")
    public WebElement motherPhoneTextBox;

    @FindBy(xpath = "//input[@name='mother_occupation']")
    public WebElement motherOccupationTextBox;

    @FindBy(xpath = "//input[@name='mother_pic']")
    public WebElement motherPhotoFilePicker;

    @FindBy(xpath = "//label[3]")
    public WebElement motherGuardianRadioButton;

    @FindBy(xpath = "//input[@name='guardian_email']")
    public WebElement guardianEmailTextBox;

    @FindBy(xpath = "//input[@name='guardian_pic']")
    public WebElement guardianPicTextBox;

    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public WebElement guardianAddressTextBox;

    @FindBy(xpath = "//i[@class='fa fa-fw fa-plus']")
    public WebElement addDetailButton;

    @FindBy(xpath = "//input[@onclick='return auto_fill_guardian_address();']")
    public WebElement addressCheckBox;

    @FindBy(xpath = "//input[@name='bank_account_no']")
    public WebElement bankAccountNoTextBox;

    @FindBy(xpath = "//input[@name='bank_name']")
    public WebElement bankNameTextBox;

    @FindBy(xpath = "//input[@name='ifsc_code']")
    public WebElement ifscCodeTextBox;

    @FindBy(xpath = "//input[@name='adhar_no']")
    public WebElement nationalIDTextBox;

    @FindBy(xpath = "//input[@name='samagra_id']")
    public WebElement localIDTextBox;

    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement rteRadioButtonYes;

    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolTextBox;

    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    @FindBy(xpath = "//input[@name='first_title']")
    public WebElement firstTitleTextBox;

    @FindBy(xpath = "//input[@name='first_doc']")
    public WebElement firstDocumentFilePicker;

    @FindBy(xpath = "//input[@name='second_title']")
    public WebElement secondTitleTextBox;

    @FindBy(xpath = "//input[@name='second_doc']")
    public WebElement secondDocumentFilePicker;

    @FindBy(xpath = "//input[@name='fourth_title']")
    public WebElement fourthTitleTextBox;

    @FindBy(xpath = "//input[@name='fourth_doc']")
    public WebElement fourthDocumentFilePicker;

    @FindBy(xpath = "//input[@name='fifth_title']")
    public WebElement fifthTitleTextBox;

    @FindBy(xpath = "//input[@name='fifth_doc']")
    public WebElement fifthDocumentFilePicker;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(css = ".alert.alert-success")
    public WebElement successMessage;

    public StudentPage() {
        PageFactory.initElements(driver, this);
    }
}
