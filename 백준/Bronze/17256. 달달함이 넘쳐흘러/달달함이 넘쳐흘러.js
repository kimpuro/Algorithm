const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(line => line.split(' ').map(Number));
console.log((input[1][0]-input[0][2])+" "+(input[1][1]/input[0][1])+" "+(input[1][2]-input[0][0]));