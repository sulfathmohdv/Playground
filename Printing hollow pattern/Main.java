#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int c=1;c<=n;c++)
    {
      if((r==1)||(c==1)||(r==n)||(c==n))
      {
        printf("*");
      }
      else
      {
        printf(" ");
      }
    }
    printf("\n");
  }
	return 0;
}