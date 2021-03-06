public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] nums = new int[len1+len2];
        int i = 0, j = 0, k=0;
        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i+=1;
            }else{
                nums[k] = nums2[j];
                j+=1;
            }
            k+=1;
        }
        while(i < len1){
            nums[k] = nums1[i];
            k+=1;
            i+=1;
        }
        while(j < len2){
            nums[k] = nums2[j];
            k+=1;
            j+=1;
        }
        int x = (len1+len2)/2;
        
        
        if( (len1 + len2)%2 == 0){
            return ((double)nums[x]+(double)nums[x-1])/2;
        }else
            return nums[x];
    }
}
