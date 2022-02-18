package top.mczhengyi._02_recursion;

/**
 * 使用递归对数组进行求和
 */
public class Case02SumArray {
    public static void main(String[] args) {
        System.out.printf("1+2+3+4+...+10=%d\n", sum(new int[]{1,2,3,4,5,6,7,8,9,10}, 0));
    }

    /**
     * 对arr数组的所有值求和
     */
    static int sum(int[] arr, int begin) {
        if (begin >= arr.length - 1) {
            return arr[begin];
        }
        return arr[begin] + sum(arr, begin + 1);
    }
}
