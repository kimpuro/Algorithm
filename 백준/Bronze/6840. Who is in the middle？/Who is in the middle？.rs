use std::io;

fn main() {
    let mut input1 = String::new();
    let mut input2 = String::new();
    let mut input3 = String::new();

    io::stdin().read_line(&mut input1).unwrap();
    io::stdin().read_line(&mut input2).unwrap();
    io::stdin().read_line(&mut input3).unwrap();

    let num1: i32 = input1.trim().parse().unwrap();
    let num2: i32 = input2.trim().parse().unwrap();
    let num3: i32 = input3.trim().parse().unwrap();

    let mut nums = vec![num1, num2, num3];
    nums.sort();

    println!("{}", nums[1]);
}
