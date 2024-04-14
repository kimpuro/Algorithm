const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const a = input[0];
const b = input[1];
if (a<=b){
    console.log("go");
}
else {
    console.log("no");
}