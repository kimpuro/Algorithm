int main(void) {
        int a, b, c;
        int sum[100];
        scanf("%d", &a);
        for (int i = 0; i < a; i++) {
            scanf("%d %d", &b, &c);
            sum[i] = b + c;
        }
        for (int j = 0; j < a; j++) {
            printf("%d\n", sum[j]);
        }
    }