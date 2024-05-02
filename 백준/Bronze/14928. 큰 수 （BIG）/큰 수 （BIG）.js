const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();

const result = BigInt(input) % 20000303n;
console.log(Number(result));