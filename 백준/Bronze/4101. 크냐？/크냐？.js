const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.forEach(line => {
    const [num1, num2] = line.trim().split(' ').map(num => parseInt(num));

    if (num1 === 0 && num2 === 0) {
        return;
    }

    if (num1 > num2) {
        console.log("Yes");
    } else {
        console.log("No");
    }
});
