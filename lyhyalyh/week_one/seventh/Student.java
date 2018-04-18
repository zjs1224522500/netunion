package lyhyalyh;

public class Student {
	String name;
	String number;
	Student(String a,String b){
		this.number=a;
		this.name=b;
	}
	void setname(String a){
		this.name=a;
	}
	void setnumber(String b){
		this.number=b;
	}
	String getname(){
		return name;
	}
	String getnumber(){
		return number;
	}
}
