<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<html lang="en">

<head>
	<title>Desktop SSO Demo Login Page</title>
	<link rel="STYLESHEET" type="text/css" href="wangyu.css">
</head>


<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0">

<br>

<div align="center">

	<table border="0" cellpadding="0" cellspacing="0" width="748" class="toptable">
		<tr>
			<td height="85" width="300">
				<h3>WEB SSO Demo</h3><br>
				<h2>by Devba.com of GPE-EA Sun Microsystems.</h2>
				<h1>Please login</h1>
			</td>		
		</tr>
                
	</table>
	
        <table border="0" cellpadding="0" cellspacing="0" width="748" class="centertable">
                <tr> 
                    <td>
                    <table border='0' cellspacing='0' cellpadding='0'>
				<tr><td width='598' valign='top' class='content'>
                                        <h1>Please Login</h1>
                                        <p>
                                            <form action='/SSOAuth/SSOAuth' method='post'>
                                            Username: <input type='text' name='username' size='20'><br>
                                            Password : <input type='password' name='password' size='20'>
                                            <input type='hidden' name='goto' value=<%=request.getParameter("goto")%>  />
                                                <br><br>
                                            <input type='submit' value='Login'></form>
                                        </p>
                                  </td></tr>
                        </table>          
		    </td></tr>
		</tr>
	</table>
</div>

</body>
</html>
