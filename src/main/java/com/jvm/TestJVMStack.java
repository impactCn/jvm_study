package com.jvm;

/**
 * @description: 栈溢出，打印虚拟机栈的当前深度
 * @author: SY_zheng
 * @create: 2019-03-31
 */
public class TestJVMStack {

    private int count = 0;
    // 没有出口的递归函数
    public void recursion() {
        count++;
        recursion();
    }

    public void testStack() {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of stack is " + count);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestJVMStack stack = new TestJVMStack();
        stack.testStack();
    }
}
