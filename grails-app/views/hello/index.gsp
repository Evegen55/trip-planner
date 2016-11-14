<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Render Domain</title>
</head>
<body>
    <table>
        <tr>
            <td>Name</td>
            <td>Age</td>
        </tr>
        <g:each in="${list}" var="person">
        <tr>
            <td>${person.lastName}, ${person.firstName}</td>
            <td>${person.age}</td>
        </tr>
        </g:each>        
    </table>
</body>
</html>
