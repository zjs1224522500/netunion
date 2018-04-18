package kuangjia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;


public class ditu {

    public static Map<Integer,String> students = new HashMap<>();

    public static void increase()
    {
        System.out.print("请输入ID");
        Scanner in=new Scanner(System.in);
        Integer id=in.nextInt();
        if(students.get(id)!=null)
        {
            System.out.print("此人已存在");
        } else
            {
                System.out.print("请输入课程");
                Scanner in1=new Scanner(System.in);
                String lesson=in1.nextLine();
                students.put(id,lesson);
            }
    }

    public static void cha()
    {
        System.out.print("请输入ID");
        Scanner in=new Scanner(System.in);
        Integer id=in.nextInt();
        if(students.get(id)==null)
        {
            System.out.print("查无此人");
        }else
        {
            System.out.print(students.get(id));
        }
    }

    public static void shan()
    {
        System.out.print("请输入ID");
        Scanner in=new Scanner(System.in);
        Integer id=in.nextInt();
        if(students.get(id)==null) {
            System.out.print("查无此人");
        }else {
            students.put(id,null);
        }
    }

    public static void gai()
    {
        System.out.print("请输入ID");
        Scanner in=new Scanner(System.in);
        Integer id=in.nextInt();
        if(students.get(id)==null) {
            System.out.print("查无此人");
        }else {
            System.out.print("你要改的内容");
            Scanner con= new Scanner(System.in);
            String lesson=con.nextLine();
            students.put(id,lesson);
        }
    }

    public static void main(String[] args) {

        while(true){
            System.out.print("shuru");
            Scanner in=new Scanner(System.in);
            Integer id=in.nextInt();
        switch(id)
        {
            case 1:
                {
                    increase();
                    break;
                }
            case 2:
                {
                    cha();
                    break;
                }
            case 3:
                {
                    shan();
                    break;
                }
            case 4:
                {
                     gai();
                     break;
                }
                default:{
                    return;
                }
        }
        }
    }

}
