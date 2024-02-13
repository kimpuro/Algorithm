import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        int[] array2 = new int[size];
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
            array2[i] = scanner.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.printf("Case #%d: %d\n",i+1,array[i]+array2[i]);
        }
    }
}