
public class HelloWorlda1 {
	public static void main(String[] args) {
		String fileName="HelloWorld.java";
		String email="HelloWoeld@immoc.com";
	    int index =fileName.lastIndexOf(".");
	    String prefix=fileName.substring("index+1,fileName.length()");
	    if(index !=-1&& index !=prefix.equals("java")){
			System.out.println("JAVA�ļ�����ȷ");
	    }else{
			System.out.println("java�ļ�����Ч");
	    }
	    int index2=email.indexOf("@");
	    int index3=email.indexOf(".");
	    if(index2!=-1&&index3>index2){
			System.out.println("�ʼ���ʽ��ȷ");
	    }else{
			System.out.println("�ʼ���ʽ��Ч");
	    }
	}

}
