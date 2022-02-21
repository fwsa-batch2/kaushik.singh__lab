
const fact = parseInt(prompt('Enter a Number: '));
if (fact < 0) {
document.write('Factorial for negative number does not exist.');
}
else if (fact === 0) {
document.write(`The factorial of ${fact} is 1.`);
}
else {
let num = 1;
for (a = 1; a <= fact; a++) {
    num *= a;
}
document.write(`The factorial of ${fact} is ${num}.`);
}
