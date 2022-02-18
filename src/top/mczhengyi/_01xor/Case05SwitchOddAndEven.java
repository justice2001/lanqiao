package top.mczhengyi._01xor;

/**
 * 交换二进制的奇数位和偶数维
 */
public class Case05SwitchOddAndEven {
    public static void main(String[] args) {
        int a = 9;
        int even = 0xaaaaaaaa;
        int odd = 0x55555555;
        int b = ((a & odd) << 1) ^ ((a & even) >> 1);
        System.out.println(b);
    }
}
