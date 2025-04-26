let generateCard = document.getElementById("generateCard");

let receptKaard = {
  recept: " ",
  bereidingstijd: 0,
  ingredienten: [],
};

generateCard.addEventListener("click", function () {
  let inputRecept = document.getElementById("recipeName").value;
  let inputBereidingstijd = document.getElementById("prepTime").value;
  let inputIngredienten = document.getElementById("ingredients").value;
  let inputIngredientenArr = inputIngredienten.split("\n");

  inputIngredientenArr.forEach((item) => {
    let li = document.createElement("li");
    li.innerText = item;
    receptKaard.ingredienten.push(li.innerText);
  });

  receptKaard.recept = inputRecept;
  receptKaard.bereidingstijd = inputBereidingstijd;
  receptKaard.ingredienten = inputIngredientenArr;

  let resultDiv = document.getElementById("result");
  resultDiv.innerHTML = `
    <p>${receptKaard.recept}</p>
    <p>bereidingstijd: ${receptKaard.bereidingstijd} minuten</p>
    <p>ingredienten: </P>
    <ul>${receptKaard.ingredienten
      .map((ingredient) => `<li>${ingredient}</li>`)
      .join("")}</ul>
  `;
});
