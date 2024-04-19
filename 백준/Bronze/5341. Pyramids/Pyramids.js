const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');


   input.forEach((el) => {
       if(el==="0") {
       }else {
           console.log(sum(el));
       }
    }
   )

function sum(n) {
    let sum = 0;

    for (let i = 1; i <= n; i++) {
        sum += i;
    }

    return sum;
}
