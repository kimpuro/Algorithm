const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

if (input[0]=== input[1]) {
  console.log('1');
} else {
    console.log('0');
}