package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time1 ex: xx:xx:xx");
        String t1 = sc.next();
        System.out.println("enter the time1 ex: xx:xx:xx");
        String t2 = sc.next();
        String a1 []= t1.split(":");
        String a2 []= t2.split(":");
        int h1 = Integer.parseInt(a1[0]);
        int h2 = Integer.parseInt(a2[0]);
        int h3 = Math.abs(h1-h2);         //小時相差
        int m1 = Integer.parseInt(a1[1]);
        int m2 = Integer.parseInt(a2[1]);
        int m3 = Math.abs(m1-m2);         //分相差
        int s1 = Integer.parseInt(a1[2]);
        int s2 = Integer.parseInt(a2[2]);
        int s3 = Math.abs(s1-s2);         //秒相差
        int ts = h3*3600+m3*60+s3;        //總相差秒數
        System.out.println("Total difference "+ts+"s");
    }
}