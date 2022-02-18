package top.mczhengyi._01xor;

import java.util.Scanner;

/**
 * 计算某数在二进制中出现1的次数
 *
 * 思路： 使用与运算，求出每位是否为1
 */
public class Case03Count1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Solve Here
        int count = 0;
        for (int i = 0 ; i < 32 ; i ++) {
            if (((n >>> i) & 1) == 1) {
                count++;
            }
        }
        System.out.printf("Solve 1: \"1\" Count=%d\n", count);
        /*
        思路2： 使用 1000 - 1 = 0111 和 0111 & 1000 = 0 来消除1的方法
        消除1的次数即为1的个数
         */
        count = 0;
        while (n != 0) {
            n = (n - 1)&n;
            count ++;
        }
        System.out.printf("Solve 2: \"1\" Count=%d", count);
    }
}
