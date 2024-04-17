const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let a;

input.forEach(line => {
    const numbers = line.trim().split(' ').map(num=>parseInt(num));
    a= numbers[1]/(numbers[0]+1);

    console.log(Math.floor(a));
});