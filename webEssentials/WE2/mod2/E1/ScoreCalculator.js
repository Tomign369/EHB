let scoreArray = [];
let addscore = document.getElementById("addScore");

addscore.addEventListener("click", function () {
  let score = document.getElementById("score");
  scoreArray.push(Number(score.value));
  score.value = "";

  function updateScores() {
    // Calculating average
    let sum = 0;
    for (let i = 0; i <= scoreArray.length - 1; i++) {
      sum += scoreArray[i];
    }
    let updateAverage = (sum / scoreArray.length).toFixed(2);
    let average = document.getElementById("average");
    average.innerText = updateAverage;

    // Adding high score
    let updateHighScore = Math.max(...scoreArray);
    let highScore = document.getElementById("highest");
    highScore.innerText = updateHighScore;

    // Making UL from the scoreArray
    let list = document.getElementById("scoreList");
    // To clear list
    list.innerHTML = "";

    scoreArray.forEach((item) => {
      let li = document.createElement("li");
      li.innerText = item;
      list.appendChild(li);
    });
  }

  updateScores();
});
