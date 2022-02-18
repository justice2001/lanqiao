package top.mczhengyi._01xor;

/**
 * 求唯一不重复数： 有k个相同的数，只有1个是无重复的，请把它找出来。
 * 思路：k个k进制数做不进位加法运算结果为0
 */
public class Case07KScaleRepeat {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 4, 4, 4, 5,5,5, 12, 6,6,6, 7,7,7, 8,8,8, 10,10,10};
        int k = 3;
        // 转换为三进制
        int maxLen = 0;
        char[][] kRadix = new char[arr.length][];
        for (int i = 0;i < arr.length;i++) {
            kRadix[i] = new StringBuilder(Integer.toString(arr[i], k)).reverse().toString().toCharArray();
            if (kRadix[i].length > maxLen) {
                maxLen = kRadix[i].length;
            }
        }
        // 不进位加法
        int[] resAns = new int[maxLen];
        for (int i = 0;i < kRadix.length;i++) {
            for (int j = 0;j < maxLen;j++) {
                if (j >= kRadix[i].length) {
                    resAns[j] += 0;
                } else {
                    resAns[j] += (kRadix[i][j] - '0');
                }
            }
        }
        // 还原十进制
        int ans = 0;
        for (int i = 0;i < maxLen;i++) {
            ans += (resAns[i] % k) * (Math.pow(k, i));
        }
        System.out.printf("The Answer=%d", ans);
    }
}
