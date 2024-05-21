const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

if (input === 'SONGDO') {
    console.log('HIGHSCHOOL');
} else if (input === 'CODE') {
    console.log('MASTER');
} else if (input === '2023') {
    console.log('0611');
} else if (input === 'ALGORITHM') {
    console.log('CONTEST');
}