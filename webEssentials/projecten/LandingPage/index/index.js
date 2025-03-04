// login screen onclick

document.addEventListener("DOMContentLoaded", function () {
  let login = document.querySelector("#sign-up");
  let loginContainer = document.querySelector(".login-container");

  login.addEventListener("click", function () {
    console.log("button clicked!");
    loginContainer.style.visibility = "visible !important";
    loginContainer.style.display = "flex";
    loginContainer.style.opacity = "1";
    loginContainer.style.pointerEvents = "auto";
  });
});
