public class RemoveElement {
    
//     nums =
// [0,1,2,2,3,0,4,2]
// val =
// 2
// Output
// [0,1,3,0,4]
// Expected
// [0,1,4,0,3]

public int removeElement(int[] nums, int val) {
    int j = 0;
    
    for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                int temp = nums[i];
                nums[j] = nums[i];
                j++;
            }
    }
    return j;
}
}
