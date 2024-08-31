<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="form1.css">
<title>Package Creation</title>

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
<div>
<form action="insert" method="post">
<div class="form-container">
        <h1>Package Creation</h1>
		<div class="form-group">
		Package Type <input type="text" name="packageName"><br>
		</div>
		<div class="form-group">
		Event Name <input type="text" name="eventPackageName"><br>
		</div>
		<div class="form-group">
		Price <input type="text" name="price"><br>
		</div>
		<div class="form-group">
		Access password<input type="text" name="accessPW"><br>
		</div>
		<input type="submit" name="submit" value="Submit">
</div>
</form>
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