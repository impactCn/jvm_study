package com.jvm;

/**
 * @description: 局部变量区的基本单位“byte”对GC的影响
 * @author: SY_zheng
 * @create: 2019-03-31
 */
public class TestGC {

    public static void test1() {
        byte[] bytes = new byte[6 * 1024 * 1024];
        System.gc();

        System.out.println("first explict go over");
    }

    public static void main(String[] args) {
        TestGC.test1();
    }

}
