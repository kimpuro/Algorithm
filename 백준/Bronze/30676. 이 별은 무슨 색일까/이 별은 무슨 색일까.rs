use std::io::{self, BufRead};

fn main() {
    let stdin = io::stdin();
    let line = stdin.lock().lines().next().unwrap().unwrap();
    let a: i32 = line.trim().parse().unwrap();

        match a {
            a if a >= 781 || a < 380 => println!("error"),
            a if a >= 620 => println!("Red"),
            a if a >= 590 => println!("Orange"),
            a if a >= 570 => println!("Yellow"),
            a if a >= 495 => println!("Green"),
            a if a >= 450 => println!("Blue"),
            a if a >= 425 => println!("Indigo"),
            _ => println!("Violet"),
    }
}