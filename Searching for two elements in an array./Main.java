#include<stdio.h>
int main()
{
    // Get the array size
        int arr_size;
        scanf("%d",&arr_size);
        int arr[10];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        // Get the searching element 1
        int search_elem_1;
        scanf("%d",&search_elem_1);
        // Get the search element 2
        int search_elem_2;
        scanf("%d",&search_elem_2);
        // Initialize two varibles to store the given elements index
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        // scan each element in an array
        // If element 1 and element 2 found, then store the index value 
        // Otherwise it will search till it reaches the arr_size - 1
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            if(search_elem_1 == arr[idx])
            {
                elem_1_idx = idx;
            }
            if(search_elem_2 == arr[idx])
            {
                elem_2_idx = idx;
            }
        }
        printf("%d\n",elem_1_idx);
        printf("%d\n",elem_2_idx);
  return 0;
}