import { verzendBerichtAsync } from "./VerstuurBerichtAPI.js";
import { lijstjeAsync } from "./GebruikersOphalen.js";
import { transAsync } from "./dataFilterenEnTransformeren.js";

const button = document.getElementById("fetchButton");
button.addEventListener("click", verzendBerichtAsync);
lijstjeAsync();
transAsync();
