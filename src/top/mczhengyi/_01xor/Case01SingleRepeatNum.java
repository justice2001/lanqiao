package top.mczhengyi._01xor;

import java.util.Arrays;
import java.util.Random;

/**
 * 使用位运算进行求唯一重复的数
 * 条件: 只允许访问一次数组，且不能产生多余的空间
 * 知识点： ^(异或) 运算符号
 * 异或运算规则： A ^ A = 0   A ^ B = A
 */
public class Case01SingleRepeatNum {
    public static void main(String[] args) {
        int N = 1001;
        int[] arr = new int[N];
        // Init Data
        for (int i = 0;i < N;i++) {
            arr[i] = i + 1;
        }
        // Get A Random Number
        int random = new Random().nextInt(N - 1) + 1;
        int idx = new Random().nextInt(N);
        arr[N-1] = random;
        int t = arr[idx];
        arr[idx] = arr[N-1];
        arr[N-1] = t;
        System.out.println(Arrays.toString(arr));
        System.out.println("Want Answer Is: " + random);
        // Solve Here
        int x = 0;
        for (int i = 0;i < N;i++) {
            x = x ^ (arr[i]);
        }
        for (int i = 1;i < N;i++) {
            x = x ^ i;
        }
        System.out.println("Answer Is: " + x);
    }
}
