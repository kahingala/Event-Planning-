<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Package</title>
<link rel="stylesheet" href="table.css">

</head>
<body>
<div class="voice">
<a href="#">
  <input type="image" src="logo.jpg" name="voice" width="100" height="100" alt="voice"/>
 </a>
</div>
<div class="log">
<a href="user.html">
  <input type="image" src="Log2.png" name="log" width="60" height="60" alt="log"/>

 
</a>
</div>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="home.html">Home</a>
  <a href="vote.html">Booking</a>
  <a href="result.html">Payment</a>
  <a href="about us.php">About us</a>
  <a href="contact us.php">Contact us</a>
  
</div>

<span style="font-size:50px;cursor:pointer" onclick="openNav()">&#9776; </span>



<div class="btn-group">

  <button onclick="window.location.href='vote.html'">Booking</button>
  <button onclick="window.location.href='result.html'">Payment</button>
  <button onclick="window.location.href='about us.php'">About Us</button>
  <button onclick="window.location.href='contactus.php'">Contact Us</button>
  <button onclick="window.location.href='log.html'">LOG OUT</button>
</div>




<div class="table-container">
     <h1>Create Package</h1>
<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="pid" value="${cus.pid}"/>
	<c:set var="packageName" value="${cus.packageName}"/>
	<c:set var="eventPackageName" value="${cus.eventPackageName}"/>
	<c:set var="price" value="${cus.price}"/>
	<c:set var="accessPW" value="${cus.accessPW}"/>
	
	
	<tr>
		<td>Package ID</td>
		<td>${cus.pid}</td>
	</tr>
	<tr>
		<td>Package Name</td>
		<td>${cus.packageName}</td>
	</tr>
	<tr>
		<td>Event name</td>
		<td>${cus.eventPackageName}</td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${cus.price}</td>
	</tr>

	<tr>
		<td>Access Password</td>
		<td>${cus.accessPW}</td>
	</tr>
	
	</c:forEach>
	</table>
<c:url value="update.jsp" var="cusupdate">
		<c:param name="pid" value="${pid}"/>
		<c:param name="packageName" value="${packageName}"/>
		<c:param name="eventPackageName" value="${eventPackageName}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="accessPW" value="${accessPW}"/>
		
	</c:url>
	
	<a href="${cusupdate}">
	<input type="submit" name="update" value="Update Package Details">
	</a>
	
	<br><br>
	<c:url value="delete.jsp" var="cusdelete">
		<c:param name="pid" value="${pid}" />
		<c:param name="packageName" value="${packageName}" />
		<c:param name="eventPackageName" value="${eventPackageName}" />
		<c:param name="price" value="${price}" />
		<c:param name="accessPW" value="${accessPW}" />
	</c:url>
	<a href="${cusdelete}">
	<input type="submit" name="delete" value="Delete Package Details">
	</a>
</div>





<footer>
        <div class="footer-content">
            <h3>DREAM EVENTZ</h3>
            <p>"Welcome to the online event planning system! How can I assist you today? Whether you're organizing 
				a corporate conference, a wedding, a birthday party, or any other event, I'm here to help you with 
				the planning process. Just let me know what you need assistance with, and I'll provide guidance and 
				information to make your event a success."</p>
            <ul class="socials">
                <li><a href=><img src="images/face.png" height="30"><i class="fa fa-facebook"></i></a></li>
                <li><a href=><img src="images/twi.png" height="30"><i class="fa fa-twitter"></i></a></li>
                <li><a href=><img src="images/google.png" height="50"><i class="fa fa-google"></i></a></li>
                <li><a href=><img src="images/you.png" height="30"><i class="fa fa-youtube"></i></a></li>
                <li><a href=><img src="images/inster.png" height="30"><i class="fa fa-instergram"></i></a></li>
            </ul>
        </div>
        <div class="footer-bottom">
            <p>copyright &copy; <a href="#">HS</a>  </p>
                    <div class="footer-menu">
                      <ul class="f-menu">
                        <li><a href="privacy policy.html">Privacy policy</a></li>
                        <li><a href="about us.php">About</a></li>
                        <li><a href="contactus.php">Contact</a></li>
                        <li><a href="tc.html">Terms & Conditions</a></li>
                      </ul>
                    </div>
        </div>

    </footer>
</body>
</html>