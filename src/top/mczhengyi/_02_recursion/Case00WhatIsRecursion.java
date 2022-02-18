package top.mczhengyi._02_recursion;

/**
 * 什么是递归
 */
public class Case00WhatIsRecursion {
    public static void main(String[] args) {
        f(10);
    }

    static void f(int i) {
        if (i == 0) {
            return;
        }
        // 自己调用自己的行为叫做递归　
        f(i-1);
    }
}
