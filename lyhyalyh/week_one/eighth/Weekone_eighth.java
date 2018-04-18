package lyh;

import java.util.Scanner;

public class Weekone_eighth {
	public static void main(String[] args){
		MapEighth map=new MapEighth();
		System.out.println("请输入你想执行的操作：\n1: 选择课程\n2：删除所选课程\n3：修改所选课程\n4：查看已选课程\n5: 退出");
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
			System.out.println("请输入你想执行的操作：\n1:选择课程\n2：删除所选课程\n3：修改所选课程\n4：查看已选课程\n5: 退出");
			input=new Scanner(System.in);
			i=input.nextInt();
			}
		}
}
