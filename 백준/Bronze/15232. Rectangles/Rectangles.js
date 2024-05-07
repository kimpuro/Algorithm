const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const a = parseInt(input[0]);
const b = parseInt(input[1]);
let result = '';
for(let j =0; j < b; j++){
result += '*';
}
for(let i = 0; i < a; i++){
console.log(result);
}
