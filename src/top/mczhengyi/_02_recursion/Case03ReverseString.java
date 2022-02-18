package top.mczhengyi._02_recursion;

/**
 * 反转字符串
 */
public class Case03ReverseString {
    public static void main(String[] args) {
        System.out.printf("Positive: abcdef反转后: %s \n", reverseStr2("abcdef", 0));
        System.out.printf("Reverse: abcdef反转后: %s \n", reverseStr("abcdef", 5));
    }

    /**
     * 对str字符串执行反转操作
     * 逆向解法
     */
    static String reverseStr(String str, int end) {
        if (end == 0) {
            return "" + str.charAt(end);
        }
        return str.charAt(end) + reverseStr(str, end-1);
    }

    /**
     * 对str字符串执行反转操作
     * 正向解法
     */
    static String reverseStr2(String str, int end) {
        if (end == str.length() - 1) {
            return "" + str.charAt(end);
        }
        return reverseStr2(str, end + 1) + str.charAt(end);
    }
}
