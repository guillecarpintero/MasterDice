// Autor: Guillermo Carpintero
// Date: 04/03/2025
// Description: MasterDice is a simple dice rolling project. It allows users to roll dice with a customizable number of faces and quantities.


//Main dice
let mainFace = document.getElementById("mainDiceFaces");
let mainQuantity = document.getElementById("mainDiceQuantity");
let result = document.getElementById("diceResult");
let resetButton = document.getElementById("reset");
let rollButton = document.getElementById("rollDice");

console.log(mainFace);
console.log(mainQuantity);
console.log(resetButton);
console.log(rollButton);

//Throw dice method
function throwDice(diceFaces, diceQuantity) {
    let diceArray = [];
    let diceSum = 0;

    for (let i = 0; i < diceQuantity; i++) {
        let roll = Math.floor(Math.random() * diceFaces) + 1;
        diceArray.push(roll);
        diceSum += roll;
    }

    result.innerHTML = `${diceSum} - (${diceArray})`;
}

//Dice constructor
class Dice {
    constructor(quantity, face) {
        this.quantity = quantity;
        this.face = face;
        }
}

//Roll button
rollButton.addEventListener("click", function() {
    if (mainFace.value === "" || mainQuantity.value === "") {
        alert("Please, fill in the fields");
    } else {
        let faces = parseInt(mainFace.value); // Convertir a número
        let quantity = parseInt(mainQuantity.value); // Convertir a número
        throwDice(faces, quantity);
    }
});

//Reset button
resetButton.addEventListener("click", function() {
    mainFace.value = "";
    mainQuantity.value = "";
});

//Coin flip
let coinFlip = document.getElementById("coinResult");
let flipButton = document.getElementById("flipCoin");

flipButton.addEventListener("click", function() {
    let coin = Math.floor(Math.random() * 2) + 1;
    coinFlip.innerHTML = coin === 1 ? "Heads" : "Tails";
});