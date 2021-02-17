<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix='f' uri='http://www.springframework.org/tags/form' %>
<html>
<head>
    <title>Employee Form</title>
    <style>
        .errorMsg {
            color: red
        }
    </style>
</head>
<body>
<f:form action="createEmployee" method="POST" modelAttribute="employee">

    <label for="employeeIdInput">Emplyee Id: </label>
    <f:input path="employeeId" id="employeeIdInput"/>*
    <f:errors path="employeeId" cssClass="errorMsg"/>
    <br><br>
    <label for="firstNameInput">First Name: </label>
    <f:input path="firstName" id="firstNameInput"/>*
    <f:errors path="firstName" cssClass="errorMsg"/>
    <br><br>
    <label for="lastNameInput">Last Name: </label>
    <f:input path="lastName" id="lastNameInput"/>*
    <f:errors path="lastName" cssClass="errorMsg"/>
    <br><br>
    <label for="emailInput">Email: </label>
    <f:input path="email" id="emailInput"/>*
    <f:errors path="email" cssClass="errorMsg"/>
    <br><br>
    <label for="phoneInput">Phone Number: </label>
    <f:input path="phoneNumber" id="phoneInput"/>
    <f:errors path="phoneNumber" cssClass="errorMsg"/>
    <br><br>
    <label for="hireDateInput">Hire Date: </label>
    <f:input path="hireDate" id="hireDateInput"/>*
    <f:errors path="hireDate" cssClass="errorMsg"/>
    <br><br>
    <label for="jobIdInput">Job Id: </label>
    <f:input path="jobId" id="jobIdInput"/>*
    <f:errors path="jobId" cssClass="errorMsg"/>
    <br><br>
    <label for="salaryInput">Salary: </label>
    <f:input path="salary" id="salaryInput"/>
    <f:errors path="salary" cssClass="errorMsg"/>
    <br><br>
    <label for="commissionInput">Commission Percentage: </label>
    <f:input path="commissionPct" id="commissionInput"/>
    <f:errors path="commissionPct" cssClass="errorMsg"/>
    <br><br>
    <label for="managerIdInput">Manager Id: </label>
    <f:input path="managerId" id="managerIdInput"/>
    <f:errors path="managerId" cssClass="errorMsg"/>
    <br><br>
    <label for="departmentIdInput">Department Id: </label>
    <f:input path="departmentId" id="departmentIdInput"/>
    <f:errors path="departmentId" cssClass="errorMsg"/>
    <br><br>
    <input type="submit" value="Submit"/>
</f:form>
</body>
</html>
