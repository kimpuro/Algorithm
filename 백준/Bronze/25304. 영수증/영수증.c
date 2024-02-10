int main(void){
    int totalPrice,totalCount;
    int sum = 0;
    scanf("%d", &totalPrice);
    scanf("%d", &totalCount);
    for(int i=1;i<=totalCount;i++){
        int a,b;
        scanf("%d %d", &a ,&b);
        sum+=(a*b);
    }
    if(sum==totalPrice){
        printf("Yes");
    }
    else{
        printf("No");
    }
    
}