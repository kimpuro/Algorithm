use std::io;

fn main() {
    let mut a = String::new();
    io::stdin().read_line(&mut a).unwrap();
    let a: i32 = a.trim().parse().unwrap();
    let mut b = String::new();
    io::stdin().read_line(&mut b).unwrap();
    let b: i32 = b.trim().parse().unwrap();
    let mut c = String::new();
    io::stdin().read_line(&mut c).unwrap();
    let c: i32 = c.trim().parse().unwrap();

    println!("{}", a*b+c)
}