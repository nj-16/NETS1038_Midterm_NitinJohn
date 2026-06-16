<%--
    Name: Nitin John
    Student ID: 200582109
    Purpose: HTML employee registration form with HTML client side validation
    		 with added checks for required fields. 
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employment Application</title>
</head>

<body>

    <h1>Employment Application</h1>

    <form action="EmploymentApplicationServlet" method="post">

        <fieldset>
            <legend>Personal Information</legend>

            <p>
                <label for="fullName">Full Name</label><br>
                <input type="text"
                       id="fullName"
                       name="fullName"
                       maxlength="50"
                       pattern="[A-Za-z ]{1,50}"
                       title="Full name can contain only letters and spaces, max 50 characters."
                       required>
            </p>

            <p>
                <label for="currentAddress">Current Address:</label><br>
                <input type="text"
                       id="currentAddress"
                       name="currentAddress"
                       required>
            </p>

            <p>
                <label for="contactNumber">Contact Number:</label><br>
                <input type="text"
                       id="contactNumber"
                       name="contactNumber"
                       maxlength="10"
                       pattern="[0-9]{10}"
                       title="Contact number must contain exactly 10 digits."
                       required>
            </p>

            <p>
                <label for="emailAddress">Email Address:</label><br>
                <input type="email"
                       id="emailAddress"
                       name="emailAddress"
                       required>
            </p>

            <p>
                <label for="education">Highest Educational Attainment:</label><br>
                <input type="text"
                       id="education"
                       name="education"
                       required>
            </p>

            <p>
                Gender:<br>

                <input type="radio"
                       id="male"
                       name="gender"
                       value="Male"
                       required>
                <label for="male">Male</label>

                <input type="radio"
                       id="female"
                       name="gender"
                       value="Female">
                <label for="female">Female</label>

                <input type="radio"
                       id="other"
                       name="gender"
                       value="Other">
                <label for="other">Other</label>
            </p>
        </fieldset>

        <br>

        <fieldset>
            <legend>Employment Eligibility</legend>

            <p>
                <label for="dateAvailable">Date Available:</label><br>
                <input type="date"
                       id="dateAvailable"
                       name="dateAvailable"
                       required>
            </p>

            <p>
                <label for="desiredPosition">Desired Position:</label><br>
                <input type="text"
                       id="desiredPosition"
                       name="desiredPosition"
                       required>
            </p>

            <p>
                <label for="desiredSalary">Desired Salary:</label><br>
                <input type="text"
                       id="desiredSalary"
                       name="desiredSalary"
                       pattern="[0-9]{1,6}\.[0-9]{2}"
                       title="Enter up to 6 digits. Precision allowed up to 2 decimal values"
                       required>
            </p>

            <p>
                Are you legally authorized to work in the country?<br>

                <input type="radio"
                       id="authorizedYes"
                       name="legallyAuthorized"
                       value="Yes"
                       required>
                <label for="authorizedYes">Yes</label>

                <input type="radio"
                       id="authorizedNo"
                       name="legallyAuthorized"
                       value="No">
                <label for="authorizedNo">No</label>
            </p>

            <p>
                Do you have relatives working for our company?<br>

                <input type="radio"
                       id="relativesYes"
                       name="relativesInCompany"
                       value="Yes"
                       required>
                <label for="relativesYes">Yes</label>

                <input type="radio"
                       id="relativesNo"
                       name="relativesInCompany"
                       value="No">
                <label for="relativesNo">No</label>
            </p>

            <p>
                <label for="relativesExplanation">
                    If yes, please explain further:
                </label><br>

                <textarea id="relativesExplanation"
                          name="relativesExplanation"
                          rows="4"
                          cols="40"></textarea>
            </p>
        </fieldset>

        <br>

        <p>
            By submitting this application, you agree to adhere to company
            policies and provide accurate information throughout the
            employment process.
        </p>

        <button type="submit">Applicant's Signature</button>

    </form>

</html>
</body>