Feature: Login Scenarios

  @Smoke
  Scenario: Test Login
    Given a CTSMS user is on the login page "https://chromatech-test-lms.com/site/login"
    When the user logs in with valid credentials "general@teacher.com", "123456"
    Then user is directed to the landing page

  @Regression
  Scenario: Test Student Admission
    Given a CTSMS user is on the login page "https://chromatech-test-lms.com/site/login"
    When the user logs in with valid credentials "general@teacher.com", "123456"
    And the user is on the student admission page
    And enters student admission number
    And enters student roll number
    And selects "SDET" from the class dropdown
    And selects "Selenium Test Automation" from the section dropdown
    And enters student first name "John"
    And enters student last name "Doe"
    And selects "Male" from the gender option
    And enters student date of birth "01/20/2005"
    And selects "Test" from the Category dropdown
    And enters student email "abcd@gmail.com"
    And enters Admission date "12/15/2025"
    And uploads student photo
    And selects "A+" from Blood Group dropdown
    And enters As on date "01/01/2026"
    And clicks on Add Sibling button
    And selects "SDET" from sibling Class dropdown
    And selects "Selenium Test Automation" from sibling Section dropdown
    And enters sibling Student ID "abu change ()"
    And clicks on Add button
    And enters a mobile number "1234567890" in Mobile Number textbox
    And enters height "5.8" in Height textbox
    And enters weight "150" in Weight textbox
    And enters father name "Robert Doe" in Father's Name textbox
    And enters father phone number "0987654321" in Father's Phone Number textbox
    And enters father occupation "Engineer" in Father's Occupation textbox
    And selects father photo from "\src\test\resources\imageRepo\mother_image.jpg"
    And enters mother name "Jane Doe" in Mother's Name textbox
    And enters mother phone number "1122334455" in Mother's Phone Number textbox
    And enters mother occupation "Doctor" in Mother's Occupation textbox
    And selects mother photo from "\src\test\resources\imageRepo\mother_image.jpg"
    And selects mother for guardian option
    And enters guardian email "janedoe@gmail.com" in Guardian's Email textbox
    And selects guardian photo from "\src\test\resources\imageRepo\mother_image.jpg"
    And enters guardian address "123 Main St, Anytown, USA" in Guardian's Address textbox
    And clicks on Add Detail button
    And clicks on guardian same as current address checkbox
    And enters account number "123456789" in Bank Account Number textbox
    And enters bank name "Bank of Test" in Bank Name textbox
    And enters IFSC code "TEST0001234" in IFSC Code textbox
    And enters national ID number "ABCDE1234F" in PAN Number textbox
    And enters local ID number "LOC123456" in Local ID Number textbox
    And clicks yes on RTE radio button
    And enters previous school details "Test High School" in Previous School Details textbox
    And enters note "This is a test student admission." in Note textbox
    And enters first title "Mathematics" in First Title textbox
    And selects document from "\src\test\resources\file_uploads\sample1.txt" in First Document textbox
    And enters second title "Physics" in Second Title textbox
    And selects document from "\src\test\resources\file_uploads\sample2.txt" in Second Document textbox
    And enters fourth title "Transcripts" in Fourth Title textbox
    And selects document from "\src\test\resources\file_uploads\sample3.txt" in Fourth Document textbox
    And enters fifth title "Proof of Address" in Fifth Title textbox
    And selects document from "\src\test\resources\file_uploads\sample1.txt" in Fifth Document textbox
    And clicks on Save button
    Then a new student record is created successfully


  @Regression2
  Scenario Outline: Test Student Admission
    Given a CTSMS user is on the login page "https://chromatech-test-lms.com/site/login"
    When the user logs in with valid credentials "general@teacher.com", "123456"
    And the user is on the student admission page
    And enters student admission number
    And enters student roll number
    And selects "<Class>" from the class dropdown
    And selects "<Section>" from the section dropdown
    And enters student first name "<First Name>"
    And enters student last name "<Last Name>"
    And selects "<Gender>" from the gender option
    And enters student date of birth "<Date of Birth>"
    And selects "<Category>" from the Category dropdown
    And enters student email "<Email>"
    And enters Admission date "<Admission Date>"
    And selects student photo from "\src\test\resources\imageRepo\student_image.jpg"
    And selects "<Blood Group>" from Blood Group dropdown
    And enters As on date "<As On Date>"
    And clicks on Add Sibling button
    And selects "<Sibling Class>" from sibling Class dropdown
    And selects "<Sibling Section>" from sibling Section dropdown
    And enters sibling Student ID "<Sibling Student ID>"
    And clicks on Add button
    And enters a mobile number "1234567890" in Mobile Number textbox
    And enters height "5.8" in Height textbox
    And enters weight "150" in Weight textbox
    And enters father name "Robert Doe" in Father's Name textbox
    And enters father phone number "0987654321" in Father's Phone Number textbox
    And enters father occupation "Engineer" in Father's Occupation textbox
    And selects father photo from "\src\test\resources\imageRepo\mother_image.jpg"
    And enters mother name "Jane Doe" in Mother's Name textbox
    And enters mother phone number "1122334455" in Mother's Phone Number textbox
    And enters mother occupation "Doctor" in Mother's Occupation textbox
    And selects mother photo from "\src\test\resources\imageRepo\mother_image.jpg"
    And selects mother for guardian option
    And enters guardian email "janedoe@gmail.com" in Guardian's Email textbox
    And selects guardian photo from "\src\test\resources\imageRepo\mother_image.jpg"
    And enters guardian address "123 Main St, Anytown, USA" in Guardian's Address textbox
    And clicks on Add Detail button
    And clicks on guardian same as current address checkbox
    And enters account number "123456789" in Bank Account Number textbox
    And enters bank name "Bank of Test" in Bank Name textbox
    And enters IFSC code "TEST0001234" in IFSC Code textbox
    And enters national ID number "ABCDE1234F" in PAN Number textbox
    And enters local ID number "LOC123456" in Local ID Number textbox
    And clicks yes on RTE radio button
    And enters previous school details "Test High School" in Previous School Details textbox
    And enters note "This is a test student admission." in Note textbox
    And enters first title "Mathematics" in First Title textbox
    And selects document from "\src\test\resources\file_uploads\sample1.txt" in First Document textbox
    And enters second title "Physics" in Second Title textbox
    And selects document from "\src\test\resources\file_uploads\sample2.txt" in Second Document textbox
    And enters fourth title "Transcripts" in Fourth Title textbox
    And selects document from "\src\test\resources\file_uploads\sample3.txt" in Fourth Document textbox
    And enters fifth title "Proof of Address" in Fifth Title textbox
    And selects document from "\src\test\resources\file_uploads\sample1.txt" in Fifth Document textbox
    And clicks on Save button
    Then a new student record is created successfully
    Examples:
      | Class          | Section                             | First Name | Last Name | Gender | Date of Birth | Category         | Email                            | Admission Date | Blood Group | As On Date | Sibling Class  | Sibling Section                     | Sibling Student ID          |
      | SDET           | Testing Fundamentals                | Emily      | Carter    | Female | 03/14/2006    | Test             | emily.carter@studentexample.edu  | 08/15/2025     | O+          | 01/15/2025 | SDET           | Selenium Test Automation            | Sophia Martinez (ad03b3ce)  |
      | SDET           | SDLC Methodologies                  | Liam       | Patel     | Male   | 07/22/2005    | Category Test A  | liam.patel@studentexample.edu    | 06/01/2024     | A+          | 02/02/2025 | SDET           | SDLC Methodologies                  | Samuel Hernandez (9f65966f) |
      | Cyber Security | Networking Fundamentals             | Noah       | Singh     | Male   | 11/02/2004    | Student Category | noah.singh@cyberexample.edu      | 09/10/2025     | B+          | 03/10/2025 | Cyber Security | Networking Fundamentals             | Henry Das (c276b941)        |
      | SDET           | Selenium Test Automation            | Sophia     | Martinez  | Female | 05/30/2007    | Test             | sophia.martinez@testschool.org   | 01/12/2026     | A-          | 04/22/2025 | SDET           | Selenium Test Automation            | Elena Volkova (ec2e323e)    |
      | SDET           | Cucumber Fundamentals               | Mason      | Nguyen    | Male   | 12/18/2006    | Category Test A  | mason.nguyen@student.example.com | 02/20/2025     | O-          | 05/05/2025 | SDET           | Cucumber Fundamentals               | Chloe O'Neill (84c1b16e)    |
      | Cyber Security | Linux Fundamentals                  | Ava        | Sharma    | Female | 09/09/2005    | Student Category | ava.sharma@cyberacademy.edu      | 07/01/2024     | AB+         | 06/18/2025 | Cyber Security | Linux Fundamentals                  | Zoe Kapoor (cc8dcec5)       |
      | SDET           | API Testing                         | Ethan      | Brown     | Male   | 04/01/2008    | Test             | ethan.brown@testinglab.edu       | 03/03/2026     | B-          | 07/01/2025 | SDET           | API Testing                         | Lily Morgan (1d62db95)      |
      | SDET           | Git/GitHub                          | Isabella   | Wilson    | Female | 10/24/2006    | Category Test A  | isabella.wilson@codeacademy.org  | 05/18/2025     | A+          | 07/20/2025 | SDET           | Git/GitHub                          | Daniel Park (b9993c4a)      |
      | Cyber Security | CIA Triad                           | Lucas      | Khan      | Male   | 02/14/2003    | Student Category | lucas.khan@cyberinstitute.edu    | 08/30/2024     | O+          | 08/03/2025 | Cyber Security | CIA Triad                           | Aaron Shah (3012afc9)       |
      | SDET           | Java 11 for Cool People             | Mia        | Garcia    | Female | 06/06/2005    | Test             | mia.garcia@javastudents.org      | 09/01/2025     | B+          | 08/25/2025 | SDET           | Java 11 for Cool People             | Victoria Rivera (83acd957)  |
      | SDET           | Mobile Test Automation              | Oliver     | Lee       | Male   | 01/15/2007    | Category Test A  | oliver.lee@mobiletests.edu       | 11/10/2025     | AB-         | 09/09/2025 | SDET           | Mobile Test Automation              | Nathan Gomez (71ea88bb)     |
      | Cyber Security | Penetration Testing/Ethical Hacking | Charlotte  | Rao       | Female | 08/20/2004    | Student Category | charlotte.rao@pentestacademy.org | 10/05/2024     | A+          | 09/30/2025 | Cyber Security | Penetration Testing/Ethical Hacking | Ryan Mehta (13c28a22)       |
      | SDET           | Accessibility Testing               | Elijah     | Kim       | Male   | 03/03/2006    | Test             | elijah.kim@accesslearn.edu       | 04/01/2025     | O+          | 10/12/2025 | SDET           | Accessibility Testing               | Adrian Silva (69bd9688)     |
      | SDET           | Database Testing                    | Amelia     | Thompson  | Female | 11/11/2005    | Category Test A  | amelia.thompson@dbtest.edu       | 12/12/2025     | B+          | 10/28/2025 | SDET           | Database Testing                    | Marcus Wright (b8c578b6)    |
      | Cyber Security | Networking Fundamentals             | Henry      | Das       | Male   | 05/25/2006    | Student Category | henry.das@networks.edu           | 01/20/2026     | O-          | 11/05/2025 | Cyber Security | Networking Fundamentals             | Priya Nair (8cd2a7a8)       |
      | SDET           | Selenium Test Automation            | Grace      | Alvarez   | Female | 02/28/2008    | Test             | grace.alvarez@testerschool.org   | 06/15/2025     | A+          | 11/16/2025 | SDET           | Selenium Test Automation            | Elena Volkova (ec2e323e)    |
      | SDET           | SDLC Methodologies                  | Samuel     | Hernandez | Male   | 09/05/2004    | Category Test A  | samuel.hernandez@softwareedu.org | 07/07/2024     | B+          | 11/25/2025 | SDET           | SDLC Methodologies                  | Liam Patel (d3bc7c6a)       |
      | Cyber Security | Linux Fundamentals                  | Zoe        | Kapoor    | Female | 12/01/2005    | Student Category | zoe.kapoor@linuxlearn.org        | 03/11/2026     | AB+         | 12/01/2025 | Cyber Security | Linux Fundamentals                  | Ava Sharma (1d40e20b)       |
      | SDET           | Git/GitHub                          | Daniel     | Park      | Male   | 07/19/2007    | Test             | daniel.park@codehub.edu          | 08/25/2025     | O+          | 12/05/2025 | SDET           | Git/GitHub                          | Isabella Wilson (e9723fd5)  |
      | SDET           | API Testing                         | Lily       | Morgan    | Female | 04/27/2006    | Category Test A  | lily.morgan@apitesting.org       | 09/09/2025     | A-          | 03/22/2025 | SDET           | API Testing                         | Ethan Brown (f6763667)      |
      | Cyber Security | CIA Triad                           | Aaron      | Shah      | Male   | 10/08/2003    | Student Category | aaron.shah@securityedu.org       | 02/02/2025     | B+          | 02/14/2025 | Cyber Security | CIA Triad                           | Lucas Khan (081550c8)       |
      | SDET           | Java 11 for Cool People             | Victoria   | Rivera    | Female | 06/30/2005    | Test             | victoria.rivera@javaedu.org      | 05/05/2024     | O+          | 04/02/2025 | SDET           | Java 11 for Cool People             | Mia Garcia (2932c258)       |
      | SDET           | Mobile Test Automation              | Nathan     | Gomez     | Male   | 01/09/2008    | Category Test A  | nathan.gomez@mobileedu.org       | 11/20/2025     | AB+         | 05/29/2025 | SDET           | Mobile Test Automation              | Oliver Lee (f0c0d7ea)       |
      | SDET           | Testing Fundamentals                | Hannah     | Brooks    | Female | 08/16/2006    | Student Category | hannah.brooks@testschool.edu     | 04/14/2026     | B-          | 06/08/2025 | SDET           | Testing Fundamentals                | Emily Carter (2b3286b1)     |
      | Cyber Security | Penetration Testing/Ethical Hacking | Ryan       | Mehta     | Male   | 03/21/2005    | Test             | ryan.mehta@ethicalhack.org       | 06/30/2024     | A+          | 07/15/2025 | Cyber Security | Penetration Testing/Ethical Hacking | Charlotte Rao (a21a0f8d)    |
      | SDET           | Cucumber Fundamentals               | Chloe      | O'Neill   | Female | 05/12/2007    | Category Test A  | chloe.oneill@bddtests.edu        | 10/10/2025     | O+          | 08/11/2025 | SDET           | Cucumber Fundamentals               | Mason Nguyen (9876819c)     |
      | SDET           | Accessibility Testing               | Adrian     | Silva     | Male   | 11/29/2006    | Student Category | adrian.silva@accessibility.org   | 07/07/2025     | B+          | 09/21/2025 | SDET           | Accessibility Testing               | Elijah Kim (fca9fe14)       |
      | Cyber Security | Networking Fundamentals             | Priya      | Nair      | Female | 02/02/2006    | Test             | priya.nair@netsec.edu            | 09/01/2025     | A-          | 10/04/2025 | Cyber Security | Networking Fundamentals             | Noah Singh (61b304b7)       |
      | SDET           | Database Testing                    | Marcus     | Wright    | Male   | 09/14/2004    | Category Test A  | marcus.wright@dbacademy.edu      | 01/15/2026     | AB+         | 12/10/2025 | SDET           | Database Testing                    | Amelia Thompson (34c54b4c)  |
      | SDET           | Selenium Test Automation            | Elena      | Volkova   | Female | 12/22/2005    | Student Category | elena.volkova@seleniumlab.org    | 03/03/2026     | O-          | 01/20/2025 | SDET           | Selenium Test Automation            | Sophia Martinez (ad03b3ce)  |
