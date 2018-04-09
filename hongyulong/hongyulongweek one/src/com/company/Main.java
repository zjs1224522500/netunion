package com.company;

class expression{
    String word;
    public void last(char[] a)
    {
        int flag1;
        for(flag1=a.length-2;flag1>0&a[flag1]==' ';flag1--){ }
        System.out.print(flag1+"\n"+(a.length-flag1-2)+"\n");
        a[flag1+1]=a[a.length-1];
        for(int i=flag1+2;i<a.length;i++)
        {
            a[i]=' ';
        }
    }
    public void front(char[] a)
    {
        int flag1,flag2;
        for(flag1=1;flag1<a.length&a[flag1]==' ';flag1++){ }
        System.out.print((flag1-1)+"\n");
        for( flag2=1;flag2<(a.length-flag1+1);flag2++)
        {
            a[flag2]=a[flag2+flag1-1];
        }
        for(;flag2<a.length;flag2++)
        {
            a[flag2]=' ';
        }
    }
}
public class Main {

    public static void main(String[] args)
    {
        expression word=new expression();
        word.word="“ Hello World      Hello Uestc  Haha  nu      ”";
        System.out.print("原语句为"+word.word+"\n");
        char[] data=word.word.toCharArray();
        System.out.print(data.length+"\n");
        System.out.print(data[data.length-1]+"\n");
        word.last(data);
        shuchu(data);
        System.out.print("\n");
        word.front(data);
        shuchu(data);

    }
    public static void shuchu(char[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
