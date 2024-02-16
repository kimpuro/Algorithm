import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i =1; i<= count; i++){
            for(int k=1; k<=(count-i); k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
            System.out.print("*");
            if(j==i) System.out.printf("\n");
        }}
    }
}
