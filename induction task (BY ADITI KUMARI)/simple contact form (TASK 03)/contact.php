<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
  $name = $_POST['name'];
  $email = $_POST['email'];
  $phone = $_POST['phone'];
  $message = $_POST['message'];
  
  $to = 'aditik.ug22.cs@nitp.ac.in'; //replace with your own email address
  $subject = 'New Contact Form Submission';
  $body = "Name: $name\nEmail: $email\nPhone: $phone\nMessage:\n$message";
  $headers = "From: $email\n";
  
  if (mail($to, $subject, $body, $headers)) {
    http_response_code(200);
  } else {
    http_response_code(500);
  }
}
?>
