#include <stdio.h>
int main(){
	int n;
    scanf("%d", &n);
    int turn = 0;
    for(int curr_row = 1; curr_row <= n; curr_row++){
        for(int curr_col = 1; curr_col <= curr_row; curr_col++){
            if(turn == 0)
            {
                printf("*");
                turn = 1;
            }
            else{
                printf("#");
                turn = 0;
            }
        }
        printf("\n");
    }
  	return 0;
}