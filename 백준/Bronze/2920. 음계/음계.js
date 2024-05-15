const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

if (input.join('') === "12345678") {
    console.log("ascending");
} else if (input.join('') === "87654321") {
    console.log("descending");
} else {
    console.log("mixed");
}
