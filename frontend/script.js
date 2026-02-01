async function playGame() {
  const number = document.getElementById("numberInput").value;
  const result = document.getElementById("result");

  const response = await fetch(`http://localhost:8080/api/game/guess?number=${number}`);
  const text = await response.text();

  result.innerText = text;
}
