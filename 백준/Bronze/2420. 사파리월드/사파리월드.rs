use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    
    let mut numbers = input
        .split_whitespace()
        .map(|x| x.parse::<i64>().unwrap());

    let (a, b) = (numbers.next().unwrap(), numbers.next().unwrap());

    let diff = (a - b).abs();

    println!("{}", diff);
}