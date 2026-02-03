async function playGame() {
  const number = document.getElementById("numberInput").value;
  const result = document.getElementById("result");

  const response = await fetch(`http://3.92.66.58:8080/api/game/guess?number=${number}`);
  const text = await response.text();

  result.innerText = text;
}
