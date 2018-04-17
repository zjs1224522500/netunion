
public class ThreadOne extends Thread {
	private int i;
	static String id;
	ThreadOne(String id){
		this.id=id;
	}
	public void run(){
		for(i=0;i<5;i++){
			System.out.println(ThreadOne.id+"一号线程已启动");
		}
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}