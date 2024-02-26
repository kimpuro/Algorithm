#include <stdio.h>
int main(void){
    int a[9];
    scanf("%d %d %d %d %d %d %d %d %d",&a[0],&a[1],&a[2],&a[3],&a[4],&a[5],&a[6],&a[7],&a[8]);
    int max = 0;
    int count = 0;
    for(int i = 0; i<9;i++){
        if(a[i]>max){
            max = a[i];
            count = i+1;
        }
    }
    printf("%d\n%d",max,count);
}