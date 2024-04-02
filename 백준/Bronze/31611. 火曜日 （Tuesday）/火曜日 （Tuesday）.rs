use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();

    let n: i32 = n.trim().parse().unwrap();

    if n % 7 == 2 {
        println!("1");
    } else {
        println!("0");
    }
}