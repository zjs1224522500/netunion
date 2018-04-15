
public class HelloWorlda1 {
	public static void main(String[] args) {
		String fileName="HelloWorld.java";
		String email="HelloWoeld@immoc.com";
	    int index =fileName.lastIndexOf(".");
	    String prefix=fileName.substring("index+1,fileName.length()");
	    if(index !=-1&& index !=prefix.equals("java")){
			System.out.println("JAVA文件名正确");
	    }else{
			System.out.println("java文件名无效");
	    }
	    int index2=email.indexOf("@");
	    int index3=email.indexOf(".");
	    if(index2!=-1&&index3>index2){
			System.out.println("邮件格式正确");
	    }else{
			System.out.println("邮件格式无效");
	    }
	}

}
