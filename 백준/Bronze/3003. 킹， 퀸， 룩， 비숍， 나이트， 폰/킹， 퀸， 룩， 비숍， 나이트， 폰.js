const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split(' ');
const a = 1-input[0];
const b = 1-input[1];
const c = 2-input[2];
const d = 2-input[3];
const e = 2-input[4];
const f = 8-input[5];
console.log(a, b, c, d, e, f);