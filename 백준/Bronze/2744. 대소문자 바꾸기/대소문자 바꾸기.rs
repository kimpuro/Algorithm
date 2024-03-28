use std::io;

fn swap_case(input: &str) -> String {
    input.chars().map(|c| {
        if c.is_ascii_uppercase() {
            c.to_ascii_lowercase()
        } else if c.is_ascii_lowercase() {
            c.to_ascii_uppercase()
        } else {
            c
        }
    }).collect()
}

fn main() {
    let mut input_string = String::new();
    io::stdin().read_line(&mut input_string).unwrap();
    let result = swap_case(input_string.trim());
    println!("{}", result);
}