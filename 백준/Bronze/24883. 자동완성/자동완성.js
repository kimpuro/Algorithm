const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

if(input ==='N'|| input ==='n'){
    console.log('Naver D2')
}
else{
    console.log('Naver Whale')
}