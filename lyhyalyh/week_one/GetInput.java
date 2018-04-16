import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GetInput {
	 public static void main(String args[]) throws IOException{
		 //创建一个文件
		 File f=new File("got.txt");
		 if(!f.exists()){
			 try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		 String str=new String();
		 System.out.println("请输入数据：");
		 Scanner s = new Scanner(System.in);
		 str = s.nextLine();
		 s.close();
		 BufferedWriter fr=new BufferedWriter(new FileWriter(f));
		 fr.write(str);
		 fr.close();
	 }
}
