#include <stdio.h>
int main() {
    int n;
  scanf("%d",&n);
  int val=n;
  for(int i=1;i<=n;i++)
  {
  for(int k=val;k>=1;k--)
  {
    printf("%d",k);
  }
    val--;
  printf("\n");
  }
	return 0;
}
