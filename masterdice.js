// Autor: Guillermo Carpintero
// Date: 04/03/2025
// Description: MasterDice is a simple solution for throwing dice. It allows you to throw a dice with a certain number of faces and a certain number of dice. 
//              It also allows you to create a dice object with a certain number of faces and a certain number of dice.


//Main dice
let mainFace = document.getElementById("mainDiceFaces");
let mainQuantity = document.getElementById("mainDiceQuantity");
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

    console.log(`You have thrown ${diceQuantity} dice with ${diceFaces} faces each. The result is: ${diceArray}. The sum is: ${diceSum}`);
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

//Coin flip Button



















/* //Variables
let diceFaces = 0;
let diceQuantity = 0;

//Throw dice method
function throwDice(diceFaces, diceQuantity) {
    let diceArray = [];
    let diceSum = 0;

    for (let i = 0; i < diceQuantity; i++) {
        diceArray.push(Math.floor(Math.random() * diceFaces) + 1);
        diceSum += diceArray[i];
    }

    console.log(`You have thrown ${diceQuantity} dice with ${diceFaces} faces each. The result is: ${diceArray}. The sum is: ${diceSum}`);

}

//Dice constructor
class Dice {
    constructor(quantity, face) {
        this.quantity = quantity;
        this.face = face;
        }
}




// Crear un nuevo objeto Persona
const sixDice = new Dice (3,6);
throwDice(diceFaces, diceQuantity); */