import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr1 = new int[count];
        int[] arr2 = new int[count];
        for(int i = 0; i < count; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for(int i = 1; i <= count; i++){
            System.out.printf("Case #%d: %d + %d = %d\n", i, arr1[i-1], arr2[i-1], arr1[i-1] + arr2[i-1]);
        }
    }
}