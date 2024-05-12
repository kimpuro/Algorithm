const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();

const a =Math.floor(input / 5);


if (Math.floor(input % 5)===0){
    console.log(a);
}
else {
    console.log(a+1);
}
