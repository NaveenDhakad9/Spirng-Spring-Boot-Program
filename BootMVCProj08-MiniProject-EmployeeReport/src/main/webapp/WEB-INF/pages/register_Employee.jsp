<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<h1 style="color:red;text-align:center"> Register Employee</h1>

<frm:form modelAttribute="emp">
<table align="center" bgcolor="cyan">
<tr>
<td>Employee Name::</td>
<td><frm:input path="ename"/></td>
</tr>
<tr>
<td>Employee job::</td>
<td><frm:input path="job"/></td>
</tr>
<tr>
<td>Employee Salary::</td>
<td><frm:input path="sal"/></td>
</tr>
<tr>
<td><input type="submit" value="employee_register"> </td>
<td><input type="reset" value="reset" ></td>
</tr>
</table>
</frm:form>