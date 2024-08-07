public class RemoveDuplicate {
    static int removeDuplicates(int[] nums) {
       
        int i = 0, j = 1;
        int k = 1;
        while(i < nums.length && j < nums.length){
 
             if(nums[i] == nums[j]){
                 j++;
             }
             else {
                 nums[i+1] = nums[j];
                 k++;
                 i++;
             }
        }
        return k;
     }
    //  public int removeDuplicates(int[] nums) {
       
    //     int j=0;
    //     for(int i = 1; i < nums.length; i++){
    //          if(nums[i]!=nums[j]){
    //              nums[j+1] = nums[i];
    //              j++;
                 
    //          } 
    //     }
    //     return j+1;
    //  }
    public static void main(String[] args) {
        int nums []= {0, 0, 0, 1, 1, 1, 2, 2, 3};

        System.out.println(removeDuplicates(nums));
    }
}
