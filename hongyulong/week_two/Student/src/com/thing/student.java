package com.thing;

public class student {
    public String name;
    public String stuid;

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return super.toString();
    }

    public void studnet(String name,String stuid){
        this.name=name;
        this.stuid=stuid;
    }
    public void student(){

    }
}
