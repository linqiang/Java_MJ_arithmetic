package 排序_数组;

public class _88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int cur = nums1.length - 1;
        //接下来会使用到归并排序的东西
        while (i2>=0){
            if (i1 >= 0 && nums2[i2] < nums1[i2]){
                nums1[cur--] = nums1[i1--];
            }else{ //i1 < 0 || nums[i2] >= nums1[i1]
                nums1[cur--] = nums2[i2--];
            }
        }
    }

}
