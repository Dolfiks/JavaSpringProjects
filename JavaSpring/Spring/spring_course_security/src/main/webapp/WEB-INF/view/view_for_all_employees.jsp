<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>

<body>

<h1>Information for all employees</h1>
<br><br>
<security:authorize access="hasRole('HR')">
<input type="button" value="Salary"
        onclick="window.location.href = 'hr_info'">
Only for HR role
</security:authorize>
<br><br>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance"
       onclick="window.location.href = 'manager_info'">
Only for Manager role
</security:authorize>

</body>

</html>