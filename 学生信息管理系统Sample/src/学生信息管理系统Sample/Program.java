package 学生信息管理系统Sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	public static void main(String[] args)    {
	FileOperate fo=new FileOperate();
		while (true) {
			try {
			Menu.showMenu();
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			 String ch=br.readLine();
			 switch (ch) {
			case "1":
				//增加
				fo.insert();
				break;
			case "2":
				
				fo.deletet();
				break;
			case "3":
				 
				fo.update();
				break;
			case "4":
				Menu.showMenu();
				is=new InputStreamReader(System.in);
				br=new BufferedReader(is);
				 String sid=br.readLine();
				fo.search(sid);
				break;
			case "5":
			 
				fo.showAll();
				break;
			case "0":
				//
				 System.exit(0);
				break;

			default:
				System.out.println("输入有误：:");
				break;
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void search(String sid) {
		// TODO Auto-generated method stub
		
	}

	private static void showAll() {
		// TODO Auto-generated method stub
		
	}

	private static void search() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void deletet() {
		// TODO Auto-generated method stub
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		
	}

}
