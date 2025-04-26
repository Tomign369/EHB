export async function lijstjeAsync() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    const users = await response.json();

    const userList = document.getElementById("user-list");

    users.forEach((user) => {
      const li = document.createElement("li");
      li.textContent = `${user.name} (${user.email})`;
      userList.appendChild(li);
    });
  } catch (error) {
    document.getElementById(
      "error-message"
    ).textContent = `Er ging iets mis: ${error.message}`;
  }
}
