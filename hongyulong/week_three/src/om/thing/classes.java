package om.thing;

public class classes {
    public String stuid;
    public String class1;
    public String class2;
    public String class3;

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuid() {
        return stuid;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }
    public void classes(){}
    public void classes(String stuid,String class1,String class2,String class3){
        this.stuid=stuid;
        this.class1=class1;
        this.class2=class2;
        this.class3=class3;
    }
}
