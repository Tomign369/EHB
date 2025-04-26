// let naam = prompt("wat is je naam?");
// alert(`Welkom, ${naam}! Laten we beginnen aan de quiz.`);

let score = 0;
let aantalVragen = 0;

function checkAntwoord(vraag, correctAntwoorden) {
  let antwoord = prompt(vraag).trim().toLowerCase();
  if (correctAntwoorden.includes(antwoord)) {
    correctAntwoordenInKleineLetter = correctAntwoorden.map((answer) =>
      answer.toLowerCase()
    );
    score++;
    alert("zeer goed, vuile nicht");
  } else {
    alert(`fout! Het juiste antwoord is ${correctAntwoorden[0]}`);
  }
  aantalVragen++;
}

checkAntwoord(`wie is de president van de verenigde staten?`, [
  `Trump`,
  `trump`,
]);
checkAntwoord(`Wie is de president van Rusland?`, [`Putin`, `putin`]);

alert(`Einde van de quiz, je score is ${score}/${aantalVragen}`);
