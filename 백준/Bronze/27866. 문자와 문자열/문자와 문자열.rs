use std::io;

fn main() {
    let mut s = String::new();
    io::stdin().read_line(&mut s).unwrap();

    let mut i = String::new();
    io::stdin().read_line(&mut i).unwrap();
    let i: usize = i.trim().parse().unwrap();

    if let Some(c) = s.chars().nth(i - 1) {
        println!("{}", c);
    }
}
