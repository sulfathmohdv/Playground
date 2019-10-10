#include<stdio.h>
int arr(int n, int a[], int s[]);
int main()
{
    int n;
	scanf("%d",&n);
    int a[n];
    for(int i = 0;i < n; i++)
    {
        scanf("%d", &a[i]);   
    }
    int s[3 * n];
    arr(n, a, s);
    return 0;
}    
int arr(int n, int a[], int s[])
{
	for(int i = 0; i <= n - 1; i++)
    {
        int key =  a[i];
        int flag = 1;
        for(int j = i+1; j<= n-1;j++)
        {
            if(a[j]>key)
            {
                for(int k = i; k <= j; k++)
                {
                    if(a[k]>a[j])
                    flag = 0;
                }
                if(flag == 1)
                printf("%d,%d\n", key, a[j]);
            }
            flag = 1;
        }
    }
    return 0;
}