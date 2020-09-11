package com.imti.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(Integer.compare(22,11));//比较两个数字，1>2返回1,1<2返回-1，相等返回0

        List<Book> list=new ArrayList<>();
        list.add(new Book("吴承恩",99.8,"陕西出版社"));
        list.add(new Book("罗贯中",96.8,"陕西出版社"));

        //Collections：对集合中的对象进行排序
        Collections.sort(list);



        for (Book book:list) {
            System.out.println("作者："+book.getAuthor()+"---价格"+book.getPrice());
        }
    }
}
