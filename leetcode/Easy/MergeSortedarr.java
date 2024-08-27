class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // should be sorted inside num1
        // m+n
        int i = 0, j = 0;

         int len = m + n;
         if( n > 0){
             while (i < len && j < n) {

          
          
           if(nums1[i] > nums2[j]){
           
            int temp = nums1[i];  
            
            nums1[i] = nums2[j]; 
            nums2[j] =  temp; 
            i++;
           }
           else if(nums1[i] <= nums2[j] && nums1[i] !=0){
               
               i++;  
               
           }
           
           else if(nums1[i] == 0){
             while(j < n){
                nums1[i] = nums2[j];
                j++;
                i++;
             }
           }
        
        }
        
         }
            
    }
}