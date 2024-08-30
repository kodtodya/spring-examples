<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Employee</title>
    <style>
        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        input[type="submit"], input[type="button"] {
            padding: 10px 20px;
            margin-top: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover, input[type="button"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<h1 style="text-align:center;">Add New Employee</h1>
<form:form method="post" action="save">
    <table align="center">
        <tr>
            <td>Name:</td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td><form:input path="salary" /></td>
        </tr>
        <tr>
            <td>Designation:</td>
            <td><form:input path="designation" /></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align:center;">
                <input type="submit" value="Save" />
            </td>
        </tr>
    </table>
</form:form>

<div style="text-align:center;">
    <input type="button" onclick="location.href='view';" value="View All Employees" />
</div>

</body>
</html>