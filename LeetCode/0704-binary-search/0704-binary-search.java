class Solution {
    public int search(int[] nums, int target) {

        int s = 0;
        int l = nums.length - 1;

        while(s <= l){

            int mid = (s + l) / 2;

            if(target < nums[mid]){
                l = mid - 1;

            }else if(target > nums[mid]){
                s = mid + 1;
                
            }else{
                return mid;
            }

        }
        return -1;
        
    }
}