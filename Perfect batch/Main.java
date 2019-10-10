#include<stdio.h>

void largest_elem(int list[],int size);


int main() {
   int size,list[10],i;
   
   scanf("%d",&size);

   for( i = 0; i < size ; i++)
   {
       scanf("%d",&list[i]);
   }
  
   largest_elem(list,size);
  
   return 0;  
}

 void largest_elem(int list[],int size)
 {
     int i, batch1_sum = 0, batch2_sum = 0;
     
     for( i = 0; i < size/2 ; i++)
     { 
       batch1_sum = batch1_sum + list[i];
      
     }  
    
     for( i = size/2; i < size ; i++)
     { 
       batch2_sum = batch2_sum + list[i];
      
     }  
     
     if(batch1_sum == batch2_sum)
     {
         printf("Perfect Batch" );
   
     }
     else
     {
         printf("Not a Perfect Batch");
     }
 }