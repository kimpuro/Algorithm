import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = 1000-price;
        int[] coin = {500,100,50,10,5,1};
        int count = 0;
        for(int i=0;i<coin.length;i++){
            count += money/coin[i];
            money = money%coin[i];
        }
        System.out.println(count);
    }
}