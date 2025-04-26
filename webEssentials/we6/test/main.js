import { verzendBerichtAsync } from "./VerstuurBerichtAPI.js";

const button = document.getElementById("fetchButton");

button.addEventListener("click", verzendBerichtAsync);
