<%--
  Created by IntelliJ IDEA.
  User: Mery
  Date: 11/3/2018
  Time: 15:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DemoProjectClient</title>
    <style>
        .formstyle{
            background-color: azure;
            border: 2px solid indianred;
            width: 200px;
            padding: 30px;
            margin-left: 20px;
        }
        .display{
            display:flex;
        }
    </style>
</head>
<body>
<div class="display">
    <div class="formstyle">
        <form action="adddata" method="post"  >
               email    <input type="text" name="email" required="true"/><br/><br/>
               password <input type="text" name="password" required="true"><br/><br/>
               amount   <input type="text" name="amount" required="true"/><br/><br/>
            <input type="submit" value="Add User"/>

        </form><br/><br/>
        <%if(request.getAttribute("message")!=null){%>
        <span><%=request.getAttribute("message")%></span>
        <%}%>
    </div>



    <div class="formstyle">
        <form action="delete" method="post"  >
               email    <input type="text" name="email" required="true"/><br/><br/>

            <input type="submit" value="Delete User"/>

        </form><br/><br/>
        <%if(request.getAttribute("messagedelete")!=null){%>
        <span><%=request.getAttribute("messagedelete")%></span>
        <%}%>
    </div>

</div>



</body>
</html>
