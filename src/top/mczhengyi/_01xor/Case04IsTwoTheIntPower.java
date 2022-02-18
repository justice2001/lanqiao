package top.mczhengyi._01xor;

import java.util.Random;
import java.util.Scanner;

/**
 * 使用一条语句判断是否为2的整数次方:
 * 思路===同上题， 只需要1的个数为1即可
 */
public class Case04IsTwoTheIntPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (((n - 1) & n) == 0) {
            System.out.printf("%d是2的整数次方", n);
            return;
        }
        System.out.printf("%d不是2的整数次方", n);
    }
}
