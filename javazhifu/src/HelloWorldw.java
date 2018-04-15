
public class HelloWorldw {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		s.append("iugugyugutytururtyyfuygug");
		for(int i=s.length()-3;i>0;i=i-3){
			s.insert(i,',');
		}
		System.out.println(s.toString());
		 
		// TODO Auto-generated method stub

	}

}
