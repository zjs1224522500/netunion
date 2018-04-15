
public class HelloWorld {
	public static void main(String[] args) {
		int score =84;
		Integer score1=new Integer(score);
		double score2=score1.doubleValue();
		float score3=score1.floatValue();
		int score4=score1.intValue() ;
		System.out.println("Integer"+score1);
		System.out.println("double"+score2);
		System.out.println("float"+score3);
		System.out.println("int"+score4);
	}

}
