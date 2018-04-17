import java.util.Scanner;

public class ThreadControl {
	public static void main(String[] args){
		System.out.println("ÇëÊäÈëÄãµÄÇëÇó£º");
		Scanner a=new Scanner(System.in);
		int i=a.nextInt();
		if(i==1){
			ThreadOne first=new ThreadOne("First");
			first.start();
		}else if(i==2){
			ThreadTwo second=new ThreadTwo("Second");
			second.start();
		}
		a.close();
	}
}
