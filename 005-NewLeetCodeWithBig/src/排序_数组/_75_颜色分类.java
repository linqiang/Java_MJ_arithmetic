package 排序_数组;
//https://leetcode-cn.com/problems/sort-colors/
public class _75_颜色分类 {
    public void sortColors(int[] nums) {
        /*
        * 一个只包含0，1，2的整型数组，要求对它进行【原地】排序
        * 你能相处一个仅使用常数空间的一趟扫描算法吗？
        *
        * 遇到1： 跳过，红色指针++
        * 遇到0： 跟绿色指针交换值，绿色指针++、红色指针++
        * 遇到2： 跟紫色指针交换值，紫色指针--。在此对红色指针的值进行判断
        * */
        int i = 0;
        int l = 0;
        int r = nums.length - 1;
        while (i <= r){
            int v = nums[i];
            if (v == 0){
                swap(nums,i++,l++);
            }else if (v == 1){
                i++;
            }else{
                swap(nums, i, r--);
            }
        }
    }

    private  void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
