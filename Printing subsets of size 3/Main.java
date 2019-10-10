#include<stdio.h>
int main()
{
       int arr_size;
       scanf("%d",&arr_size);
       int arr[10];
       for(int index = 0; index <= arr_size - 1; index++)
       {
          scanf("%d",&arr[index]) ;
       }
        for(int index1 = 0; index1 <= arr_size - 2; index1++)
        {
            for(int index2 = index1 + 1; index2 <= arr_size - 1; index2++)
            {
                for(int index3 = index2 + 1; index3 <= arr_size - 1; index3++)
                {
                    printf("(%d, %d, %d) ",arr[index1],arr[index2],arr[index3]);
                }
            }
            printf("\n");
        }
    return 0;
}