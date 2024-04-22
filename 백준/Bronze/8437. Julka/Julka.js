const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const a = BigInt(input[0]);
const b = BigInt(input[1]);
const c = (a-b)/2n;
console.log(`${(a+b)/2n}\n${c}`);