function calculateFactorial() {
    const number = document.getElementById('number').value;
    const resultElement = document.getElementById('result');

    if (number === '' || isNaN(number)) {
        resultElement.textContent = 'Please enter a valid number.';
        return;
    }

    const num = parseInt(number);
    if (num < 0) {
        resultElement.textContent = 'Factorial is not defined for negative numbers.';
        return;
    }

    let factorial = 1;
    for (let i = 1; i <= num; i++) {
        factorial *= i;
    }

    resultElement.textContent = `The factorial of ${num} is ${factorial}.`;
}
