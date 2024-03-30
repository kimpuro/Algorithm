use std::io;

fn main() {
    let mut input1 = String::new();
    let mut input2 = String::new();
    let mut input3 = String::new();
    let mut input4 = String::new();
    let mut input5 = String::new();

    io::stdin().read_line(&mut input1).unwrap();
    io::stdin().read_line(&mut input2).unwrap();
    io::stdin().read_line(&mut input3).unwrap();
    io::stdin().read_line(&mut input4).unwrap();
    io::stdin().read_line(&mut input5).unwrap();

    let num1: i32 = input1.trim().parse().unwrap();
    let num2: i32 = input2.trim().parse().unwrap();
    let num3: i32 = input3.trim().parse().unwrap();
    let num4: i32 = input4.trim().parse().unwrap();
    let num5: i32 = input5.trim().parse().unwrap();

    println!("{}", num1 + num2 + num3 + num4 + num5);
}