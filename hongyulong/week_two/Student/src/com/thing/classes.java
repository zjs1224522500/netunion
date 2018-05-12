package com.thing;

public class classes {
    public String classname;
    public String stuid;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }
    public classes(){}
    public classes(String classname,String stuid,String name ){
        this.classname=classname;
        this.stuid=stuid;
        this.name=name;
    }
}
