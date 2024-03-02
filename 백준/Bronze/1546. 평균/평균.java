import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0; i<N;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i= 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        double sum = 0;
        for (int i =0;i<arr.length;i++){
            double value = (double) arr[i]/ max*100;
            sum += value;
        }
        System.out.println((sum/N));

        
    }
}