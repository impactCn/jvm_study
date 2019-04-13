package com.jvm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: ArrayList和LinkList的不同
 * @author: SY_zheng
 * @create: 2019-04-13
 */
public class ArrayListAndLinkList {

    public static void main(String[] args) {

        // 比较初始化时间
        long start = System.currentTimeMillis();
        List list = new ArrayList();
        Object o = new Object();
        for (int i = 0; i < 5000000; i++) {
            list.add(o);
        }

        long end = System.currentTimeMillis();
        System.out.print("在无数据的时候，ArrayList所用时间：");
        System.out.println(end - start);
        start = System.currentTimeMillis();
        List list1 = new LinkedList();
        Object o1 = new Object();
        for (int i = 0; i < 5000000; i++) {
            list1.add(o1);
        }
        end = System.currentTimeMillis();
        System.out.print("在无数据的时候，LinkList所用时间：");
        System.out.println(end - start);


        // 插入时间
        start = System.currentTimeMillis();
        Object o2 = new Object();
        for (int i = 0; i < 1000; i++) {
            list.add(0,o2);
        }

        end = System.currentTimeMillis();
        System.out.print("有数据的情况下，ArrayList后续插入所有时间：");
        System.out.println(end - start);


        start = System.currentTimeMillis();
        Object o3 = new Object();
        for (int i = 0; i < 1000; i++) {
            list1.add(0,o3);
        }
        end = System.currentTimeMillis();
        System.out.print("有数据的情况下，LinkList后续插入所有时间：");
        System.out.println(end - start);






    }
}
