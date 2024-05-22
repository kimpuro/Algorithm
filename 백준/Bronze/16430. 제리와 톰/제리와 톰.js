const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

console.log((parseInt(input[1])-parseInt(input[0])) + ' ' + input[1]);