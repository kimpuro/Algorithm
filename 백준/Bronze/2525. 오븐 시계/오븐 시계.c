#include <stdio.h>
int main(void){
    int a,b,c;
    scanf("%d %d",&a,&b);
    scanf("%d",&c);
    if((b+c)<60){
        printf("%d %d", a,b+c);
    }
    else if((b+c)>=60){
        int d=(b+c)/60;
        a=a+d;
        if(a>=24){
            a-=24;
        }
        printf("%d %d",a,(b+c)%60);
    }
}