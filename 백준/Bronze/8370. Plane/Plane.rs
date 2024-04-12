use std::io;

fn main() {
    let mut inputs = String::new();
    io::stdin().read_line(&mut inputs).unwrap();

    let numbers: Vec<i32> = inputs.split_whitespace()
        .map(|num| num.parse::<i32>().unwrap())
        .collect();

    let (a, b, c, d) = (numbers[0], numbers[1], numbers[2], numbers[3]);

    println!("{}", (a*b)+(c*d));
}