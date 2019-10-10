#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int k;
        scanf("%d",&k);
        int arr[10];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        int freq[k];
        for(int i = 0; i <= k - 1; i++)
        {
            freq[i] = 0;
        }
        for(int idx = 0; idx <= n - 1; idx++)
        {
           freq[arr[idx] - 1]++;
        }
        for(int idx = 0; idx <= k - 1; idx++)
        {
           printf("%d %d\n",(idx + 1),freq[idx]);
        }
    return 0;
}