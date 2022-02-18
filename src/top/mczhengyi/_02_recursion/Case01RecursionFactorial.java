package top.mczhengyi._02_recursion;

/**
 * 请使用递归求出阶乘
 */
public class Case01RecursionFactorial {
    public static void main(String[] args) {
        System.out.printf("10! = %d\n", factorial(10));
    }


    /**
     * 使用递归求阶乘，步骤:
     * 1. 找重复: n! = n * (n-1) // (n-1)! = (n-1) * (n-2)
     * 2. 找变化: 在此处的变化值为 n
     * 3. 找边界: 当阶乘为1时停止
     */
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
