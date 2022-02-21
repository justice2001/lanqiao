package top.mczhengyi._02_recursion;

/**
 * 使用递归求最大公约数
 */
public class Case05GreatestCommonDiv {
    public static void main(String[] args) {
        System.out.printf("81 And 9 Common Div: %d", getGreatestCommonDiv(81, 9));
    }

    static int getGreatestCommonDiv(int m, int n) {
        if (n == 0) {
            return m;
        }
        return getGreatestCommonDiv(n, m%n);
    }
}
