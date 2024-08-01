import java.util.*;
public class TwoSum {
    
    public static void main(String[] args){
        int arr[] = {2,7,11,15};

        
        int result[] = twoSum(arr, 9);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }


    }

    public static int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
            }
            hm.put(nums[i], i);
        }
        return ans;
        
        
    }
}
