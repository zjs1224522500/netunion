package lyhyalyh;


import java.util.Scanner;

public class seventh {
	public static void main(String[] args){
		shit map=new shit();
		System.out.println("请输入你想执行的操作：\n1:增加学生信息\n2：删除学生信息\n3：修改学生信息\n4：查询学生信息\n5: 退出");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		for(;;){
			switch(i){
			case 1:
				map.add();
				break;
			case 2:
				map.delete();
				break;
			case 3:
				map.replace();
				break;
			case 4:
				map.search();
				break;
			case 5:
				return;
			default:
				System.out.println("输入错误！");
				}
			input=new Scanner(System.in);
			i=input.nextInt();
			}
		}
}
