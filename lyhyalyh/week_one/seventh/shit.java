package lyhyalyh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shit {
	public Map<String,Student> stu;
    public shit() {
        this.stu=new HashMap<String,Student>();
    }
	public void add(){
		System.out.println("请输入所要增加的学生学号：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(!stu.containsKey(str1)){
			System.out.println("请输入学生姓名：");
			@SuppressWarnings("resource")
			Scanner name=new Scanner(System.in);
			String str2=name.nextLine();
			Student stud=new Student(str1,str2);
			stu.put(str1,stud);
		}else{
			System.out.println("学号重复！");
		}
	}
	public void delete(){
		System.out.println("请输入所要删除的学生学号：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(stu.containsKey(str1)){
			if(stu.remove(str1) != null){
				System.out.println("删除成功！");
			}
		}else{
			System.out.println("不存在此学生！");
		}
	}
	public void replace(){
		System.out.println("请输入所要修改的学生学号：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(stu.containsKey(str1)){
			System.out.println("请输入所要修改的姓名：");
			@SuppressWarnings("resource")
			Scanner name=new Scanner(System.in);
			String str2=name.nextLine();
			Student stud=new Student(str1,str2);
			stu.put(str1,stud);
		}else{
			System.out.println("不存在此学生！");
		}
	}
	public void search(){
		System.out.println("请输入所要查询的学生学号：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(stu.containsKey(str1)){
			System.out.println(stu.get(str1).getname()+"  "+stu.get(str1).getnumber());
		}else{
			System.out.println("不存在此学生！");
		}
	}
}
