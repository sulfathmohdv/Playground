#include<stdio.h>
int sum_of_natural_numbers(int num);// Function declaration
int main() {
   int n;
   scanf("%d", &n);
   printf("%d", sum_of_natural_numbers(n)); // Function call
  	return 0;
}
int sum_of_natural_numbers(int num){// Function definition
    int sum = 0;
    for(int i = 1; i <= num; i++){
        sum = sum + i;
    }
    return sum;
}