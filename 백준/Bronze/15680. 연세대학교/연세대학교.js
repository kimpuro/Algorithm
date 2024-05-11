const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();

const a = parseInt(input);

if(a==0){
    console.log("YONSEI");
}
else if(a==1){
    console.log("Leading the Way to the Future");
}

