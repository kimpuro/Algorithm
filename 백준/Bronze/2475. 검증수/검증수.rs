use std::io::{self, BufRead};

fn main() {
    let stdin = io::stdin();
    let numbers: Vec<i32> = stdin.lock()
        .lines()
        .next()
        .unwrap()
        .unwrap()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();
    
    let mut sum = 0;
    for num in numbers {
        sum += num * num;
    }
    
    print!("{}", sum % 10);
}
