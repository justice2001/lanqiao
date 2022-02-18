package top.mczhengyi._02_recursion;

/**
 * 使用递归求解斐波那契数列
 */
public class Case04Fibonacci {
    public static void main(String[] args) {
        System.out.printf("斐波那契数列的第10项为: %d", fibonacci(10));
    }

    /**
     * 斐波那契
     * @param n
     * @return
     */
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
