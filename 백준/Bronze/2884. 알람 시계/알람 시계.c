int main(void){
    int a,b;
    scanf("%d %d", &a,&b);
    b-=45;
    if(b<0){
        a-=1;
        b=60+b;
    }
    if(a<0){
        a=23;
    }
    printf("%d %d",a,b);
}