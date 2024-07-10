const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();

if(input.includes('7')&&Number(input)%7===0){
   console.log('3');
}
else if(input.includes('7')&&Number(input)%7!==0){
    console.log('2');
}
else if(!input.includes('7')&&Number(input)%7===0){
    console.log('1');
}
else if(!input.includes('7')&&Number(input)%7!==0){
    console.log('0');
}