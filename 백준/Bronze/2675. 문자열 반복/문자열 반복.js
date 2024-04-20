const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const numLines = parseInt(input.shift());

for (let i = 0; i < numLines; i++) {
    const [repeatCount, str] = input[i].trim().split(' ');
    let repeatedStr = '';

    for (let j = 0; j < str.length; j++) {
        repeatedStr += str[j].repeat(parseInt(repeatCount));
    }

    console.log(repeatedStr);
}
