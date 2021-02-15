package 排序_数组;

public class _面试题_16_16_部分排序 {
    public int[] subSort(int[] array) {
        if (array.length == 0) return new int[]{-1,-1};
            // 先从左到右寻找逆序对（正序：逐渐变大）
        int max = array[0];  //假设最左边的数是最大的值
        //用来记录最右的那个逆序对为止
        int r = -1;
        for (int i = 1; i < array.length ; i++) {
            int v = array[i];
            if (v >= max){
                max = v;
            }else{
                r = i;
            }
        }

        //提前结束
        if (r == -1) return new int[] {-1,-1};
        //从右扫描到左寻找逆序对（正序：逐渐变小）

        int min = array[array.length - 1];
        //用来记录最左的那个逆序为止
        int l = -1;
        for (int i = array.length - 2; i >= 0 ; i--) {
            int v = array[i];
            if (v <= min){
                min = v;
            }else{
                l = i;
            }
        }
        return new int[]{l,r};
    }
}
