#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int factors=1;factors<=n;factors++)
  {
    if(n%factors==0)
    {
      printf("%d\n",factors);
    }
  }
	return 0;
}