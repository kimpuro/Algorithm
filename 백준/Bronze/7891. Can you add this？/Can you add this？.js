const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const a = parseInt(input.shift());
for(let i=0; i<a; i++){
    const b = input[i].split(' ');
    console.log(parseInt(b[0]) + parseInt(b[1]));
}
