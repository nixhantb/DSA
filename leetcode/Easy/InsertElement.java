public class InsertElement {

    static int bsearch(int nums[], int x) {

        int l = 0, h = nums.length - 1;
        if (x > nums[h]) {
            return h + 1;
        } else if (x < nums[l]) {
            return l;
        }
        while (l <= h) {

            int m = (l + h) / 2;

            if (nums[m] == x) {
                return m;
            }

            if (x < nums[m]){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        // surpass the highs (simple solution)
        // 
        return l;
    }

    public static void main(String[] args) {
        int nums[] = { 1,2,4,6,7};

        int k = bsearch(nums, 5);
        System.out.println(k);

    }
}
