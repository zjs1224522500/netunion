
public class ThreadTwo extends Thread{
	private int i;
	String id;
	ThreadTwo(String id){
		this.id=id;
	}
	public void run(){
		for(i=0;i<5;i++){
			System.out.println(ThreadOne.id+"二号线程已启动");
		}
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
