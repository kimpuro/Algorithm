use std::io;

fn main() {
    let mut input1 = String::new();
    io::stdin().read_line(&mut input1)
        .unwrap();

    let num1: i32 = input1.trim().parse()
        .unwrap();

    let mut input2 = String::new();
    io::stdin().read_line(&mut input2)
        .unwrap();

    let num2: i32 = input2.trim().parse()
        .unwrap();

    let sum = num1 + num2;
    println!("{}", sum);
}
