<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="text-align: center">Student Registration From </h1>
<center>
<frm:form action="register"  method="Post" modelAttribute="stud">
Student ID  <frm:input path="sno"/><br>
Student Name <frm:input path="sname"/><br>
Student address  <frm:input path="sadd"/><br>
Student average  <frm:input path="avg"/><br><br>
<input type="submit" value="register"/><br>
<input type="reset" value="cancel"/><br>
</frm:form>
</center>