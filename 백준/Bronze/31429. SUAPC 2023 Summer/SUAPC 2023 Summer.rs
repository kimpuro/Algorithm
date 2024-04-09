use std::io::{self, BufRead};

fn main() {
    let stdin = io::stdin();
    let line = stdin.lock().lines().next().unwrap().unwrap();
    let a: i32 = line.trim().parse().unwrap();

    match a {
        1 => println!("12 1600"),
        2 => println!("11 894"),
        3 => println!("11 1327"),
        4 => println!("10 1311"),
        5 => println!("9 1004"),
        6 => println!("9 1178"),
        7 => println!("9 1357"),
        8 => println!("8 837"),
        9 => println!("7 1055"),
        10 => println!("6 556"),
        11 => println!("6 773"),
        _ => println!("error"),

    }
}