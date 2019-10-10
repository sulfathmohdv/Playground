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
            int c =  a[i];
            for(int j= i+1; j <= n-1; j++)
            {       
                    if(a[j]>c)
                    printf("%d,%d\n", c,a[j]);
            }
        }
    return 0;
}