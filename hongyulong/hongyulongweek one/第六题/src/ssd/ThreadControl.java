package ssd;

import java.util.Scanner;

class ThreadOne extends Thread
{
    private int i=5;
    @Override
    public void run() {
        for(int x=0;x<5;x++)
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("1号线程已启动"+"\n");
        }
    }

}

class ThreadTwo extends Thread {
    private int i=5;
    @Override
    public void run() {
        for(int a=0;a<5;a++)
        {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("2号线程已启动"+"\n");
        }
    }
}
public class ThreadControl {
    public static void main(String[] args) {
        while(true)
        {
            System.out.print("请输入"+"\n");
            Scanner in =new Scanner(System.in);
            int i=in.nextInt();
            switch (i) {
                case 1: {
                ThreadOne first = new ThreadOne();
                first.start();
                break; }
               case 2: {
                Thread second = new ThreadTwo();
                second.start();
                break; }
              default: {
                return ; }
             }
        }
    }
}
