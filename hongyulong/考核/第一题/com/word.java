package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;;

public class word {
    public static void main(String[] args) {
        System.out.print("请输入字符串个数");
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        HashSet<String> hash=new HashSet<>();
        for(int i=0;i<N;i++){
            System.out.print("请输入数组");
            Scanner sc1=new Scanner(System.in);
            char[] str=sc1.next().toCharArray();
            Arrays.sort(str);
            String sr=new String(str);
            hash.add(sr);
        }
        System.out.print(hash.size());
    }
}
