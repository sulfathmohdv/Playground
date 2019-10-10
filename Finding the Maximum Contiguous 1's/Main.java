#include<stdio.h>
int main()
{
  int i,j,n;
  scanf("%d",&n);
  int a[n];
  for (i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int c=1;
    for (j=0;j<=n;j++)
    {
      if(a[j]==1&&a[j+1]==1)
      {
        c++;
      }
    }
  printf("%d",c);
  return 0;
}