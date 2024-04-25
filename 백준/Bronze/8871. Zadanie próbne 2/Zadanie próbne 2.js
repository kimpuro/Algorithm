const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let a = parseInt(input)+1;
console.log((a*2)+" "+(a*3));