<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employees List</title>
    <style>
        table {
            width: 70%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 2px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
        input[type="button"] {
            margin: 20px 0;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="button"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<h1>Employees List</h1>
<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Designation</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="emp" items="${list}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.salary}</td>
                <td>${emp.designation}</td>
                <td><a href="edit/${emp.id}">Edit</a></td>
                <td><a href="delete/${emp.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<input type="button" onclick="location.href='add';" value="Add New Employee" />

</body>
</html>