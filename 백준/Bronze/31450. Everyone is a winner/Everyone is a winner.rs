use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut split = input.split_whitespace();

    let a: i32 = split.next().unwrap().parse().unwrap();
    let b: i32 = split.next().unwrap().parse().unwrap();

    if a % b == 0 {
        println!("Yes");
    } else {
        println!("No");
    }
}