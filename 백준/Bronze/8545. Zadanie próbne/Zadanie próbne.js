const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

function reverseString(str) {
    return str.split('').reverse().join('');
}

console.log(reverseString(input));
