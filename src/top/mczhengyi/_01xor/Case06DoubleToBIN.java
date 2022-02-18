package top.mczhengyi._01xor;

/**
 * 将浮点数转换为二进制
 * 使用乘2法
 */
public class Case06DoubleToBIN {
    public static void main(String[] args) {
        double n = 0.625;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n = n * 2;
            // 如果乘2整数位为1则二进制位为1
            if (n >= 1) {
                sb.append("1");
                n = n - 1;
            } else {
                sb.append("0");
            }
            // 如果位数大于32则溢出
            if (sb.length() > 32) {
                System.out.println("ERROR");
                return;
            }
        }
        System.out.printf("Answer Is %s", sb);
    }
}
