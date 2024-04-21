const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const numLines = parseInt(input.shift());

for (let i = 0; i < numLines; i++) {
    let line = input[i].split(' ');
    let room = parseInt(line[2])/parseInt(line[0])+1;
    let floor = (parseInt(line[2])%parseInt(line[0]))*100;
    if(floor === 0) {
        floor = parseInt(line[0])*100;
        room -= 1;
    }
    console.log(Math.floor(floor+room));
}
