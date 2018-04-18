package lyh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEighth extends Weekone_eighth {
	public Map<String,String> eight;
    public MapEighth() {
        this.eight=new HashMap<String,String>();
    }
	public void add(){
		System.out.println("请输入所要增加的课程号：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(str1!=null){
				switch(str1){
				case "0001":
					eight.put("0001", "数字信号处理");
					break;
				case "0002":
					eight.put("0002", "随机信号分析");
					break;
				case "0003":
					eight.put("0003", "计算机组成原理");
					break;
				case "0004":
					eight.put("0004", "操作系统");
					break;
				case "0005":
					eight.put("0005", "体育");
					break;
				default:
					System.out.println("不存在此课程！");
					}
		}else{
			System.out.println("不存在此课程！");
		}
	}
	public void delete(){
		System.out.println("请输入所要删除的课程：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(eight.containsKey(str1)){
			if(eight.remove(str1) != null){
				System.out.println("删除成功！");
			}
		}else{
			System.out.println("未选此课程！");
		}
	}
	public void replace(){
		System.out.println("请输入所要修改的课程：");
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		String str1=number.nextLine();
		if(eight.containsKey(str1)){
			System.out.println("请输入所要修改的课程号：");
			@SuppressWarnings("resource")
			Scanner number1=new Scanner(System.in);
			String str2=number1.nextLine();
			eight.remove(str2);
			System.out.println("请输入所要修改成为的课程号：");
			@SuppressWarnings("resource")
			Scanner number2=new Scanner(System.in);
			String str3=number2.nextLine();
			switch(str3){
			case "0001":
				eight.put("0001", "数字信号处理");
				break;
			case "0002":
				eight.put("0002", "随机信号分析");
				break;
			case "0003":
				eight.put("0003", "计算机组成原理");
				break;
			case "0004":
				eight.put("0004", "操作系统");
				break;
			case "0005":
				eight.put("0005", "体育");
				break;
			default:
				System.out.println("不存在此课程！");
				}
			}
	}
	public void search(){
		System.out.println(eight.entrySet());
	}
}
