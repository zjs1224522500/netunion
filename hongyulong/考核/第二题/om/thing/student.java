package om.thing;

public class student {
    public String gender;
    public String stuid;
    public String name;
    public String age;

    public  student(){
         super();
    }

    public  student(String a,String b,String c,String d){

        this.gender=a;
        this.stuid=b;
        this.age=c;
        this.name=d;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getStuid() {
        return stuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    }

