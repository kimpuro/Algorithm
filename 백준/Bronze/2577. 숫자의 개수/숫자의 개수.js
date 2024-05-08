const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const result = input[0]*input[1]*input[2];
const result2 = result.toString();
let arr = [0,0,0,0,0,0,0,0,0,0];
result2.split("").forEach((el)=>{
    if(el === "0") arr[0]++;
    else if(el === "1") arr[1]++;
    else if(el === "2") arr[2]++;
    else if(el === "3") arr[3]++;
    else if(el === "4") arr[4]++;
    else if(el === "5") arr[5]++;
    else if(el === "6") arr[6]++;
    else if(el === "7") arr[7]++;
    else if(el === "8") arr[8]++;
    else if(el === "9") arr[9]++;
})
for(let i =0; i<arr.length; i++) {
    console.log(arr[i]);
}