const form = document.querySelector('#contact-form');
const submitBtn = document.querySelector('#submit-btn');

form.addEventListener('submit', (e) => {
  e.preventDefault();
  const formData = new FormData(form);
  const xhr = new XMLHttpRequest();
  xhr.open('POST', 'send-email.php');
  xhr.onload = function() {
    if (xhr.status === 200) {
      alert('Message sent!');
      form.reset();
    } else {
      alert('Message failed to send. Please try again later.');
    }
  };
  xhr.send(formData);
});
