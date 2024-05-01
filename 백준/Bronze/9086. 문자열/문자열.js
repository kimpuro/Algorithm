const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const a = input.shift();


for (let i = 0; i< a;i++){
    let str = input[i];
    console.log(str[0]+str[str.length-1]);
}