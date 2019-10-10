#include<stdio.h>
int main()
{
    int a[5][5],b[5][5];
    int diff[5][5];
    int i,j,r,c;
    scanf("%d%d",&r,&c);
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            scanf("%d",&b[i][j]);
        }
    }
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            printf("%d ",a[i][j] - b[i][j]);
        }
        printf("\n");
    }
    return 0;
}