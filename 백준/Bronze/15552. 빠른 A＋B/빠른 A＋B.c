int main(void){
    int a;
    scanf("%d",&a);
    short *arrayA = (short*) malloc(a * sizeof(short));
    short *arrayB = (short*) malloc(a * sizeof(short));
    for(int i=0;i<a;i++){
        scanf("%hd %hd",&arrayA[i],&arrayB[i]);
    }
    for(int j=0;j<a;j++){
        printf("%hd\n",arrayA[j]+arrayB[j]);
    }
    
}