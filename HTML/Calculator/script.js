let screen = document.getElementById('output');
let currentInput = '';

function appendToScreen(value) {
    currentInput += value;
    screen.innerText = currentInput;
}

function clearScreen() {
    currentInput = '';
    screen.innerText = '0';
}

function calculate() {
    try {
        let result = eval(currentInput);
        screen.innerText = result;
        currentInput = result.toString();
    } catch (error) {
        screen.innerText = 'Error';
        currentInput = '';
    }
}
