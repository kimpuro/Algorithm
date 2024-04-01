use std::io::{self, BufRead};

fn reverse(s: &str) -> String {
    let mut rev = String::new();
    for c in s.chars().rev() {
        rev.push(c);
    }
    rev
}

fn main() {
    let stdin = io::stdin();
    loop {
        let mut line = String::new();
        stdin.lock().read_line(&mut line).unwrap();
        let line = line.trim_end();
        
        if line == "0" {
            break;
        }
        
        if line == reverse(line) {
            println!("yes");
        } else {
            println!("no");
        }
    }
}