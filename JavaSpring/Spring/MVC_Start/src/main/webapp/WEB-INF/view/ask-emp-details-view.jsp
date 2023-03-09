<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h1>Dear Employee, Please enter your details</h1>

<br>
<br>

<form:form action = "showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: red"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname" cssStyle="color: red"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    Department <form:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="HR" label="HR"/>
    <form:option value="Sales" label="Sales"/>
</form:select>
    <br><br>

    Your sex:
    <form:radiobutton path="sex" value="Male" label="Male"/>
    <form:radiobutton path="sex" value="Female" label="Female"/>
    <form:radiobutton path="sex" value="Other" label="Other"/>
    <br><br>


    <input type="submit" value="Continue">
</form:form>


</body>




</html>
