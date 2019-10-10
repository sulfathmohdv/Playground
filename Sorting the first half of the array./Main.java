#include<stdio.h>
int main()
{
    int n;
	scanf("%d",&n);
    int a[n];
    for(int i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);   
    }
    insertion_sort(n,a);
    return 0;
}    
int insertion_sort(int n,int a[])
{
	for (int j= 1; j< n/2; j++) 
    {
        int c = a[j];
        int k = j - 1;
        while((k >= 0) && (a[k] > c)) 
        {
            a[k + 1] = a[k];
            k--;
        }
        a[k + 1] = c;
    }
    for(int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    return 0;
}