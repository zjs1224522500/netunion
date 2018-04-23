package om.thing;

public class student {
    public String name;
    public String stuid;
    public String age;
    public String gender;

    public student(String stuid, String name, String age, String gender) {
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

    public void studemt(String name,String stuid,String age,String gender){
        this.name=name;
        this.stuid=stuid;
        this.age=age;
        this.gender=gender;
    }
    public void student(){

    }
}
