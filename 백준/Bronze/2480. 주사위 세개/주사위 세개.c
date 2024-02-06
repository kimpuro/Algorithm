int main(void)
{
    int a, b, c, max;
    scanf("%d %d %d", &a, &b, &c);
    if (a > b)
    {
        if (a > c)
        {
            max = a;
        }
        else
            max = c;
    }
    else
    {
        if (b > c)
        {
            max = b;
        }
        else
        {
            max = c;
        }
    }
    if (a == b && b == c)
    {
        printf("%d", 10000 + (a * 1000));
    }
    else if (a == b || b == c || a == c)
    {
        int same = a == b ? a : c;
        printf("%d", 1000 + (same * 100));
    }
    else
    {
        printf("%d", max * 100);
    }
    return 0;
}