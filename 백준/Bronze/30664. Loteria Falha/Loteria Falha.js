const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.forEach((el) => {
    const a = BigInt(el);
    if (a === 0n) {
    }
    else if(a % 42n === 0n){
        console.log("PREMIADO");
    }
    else {
        console.log("TENTE NOVAMENTE");
    }
})