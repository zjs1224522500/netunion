package mianji;

class Shape
{
    private int dim1;
    private int dim2;

    public double getArea()
    {return 0;}
}

class Triangle extends Shape
{
    private int chang;
    private int kuan;

    public void setChang(int chang) {
        this.chang = chang;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    @Override
    public double getArea() {
        double area =chang*kuan/2;
        return area;
    }
}

class Rectangle extends Shape
{
    private int chang;
    private int kuan;

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public double getArea()
    {
        double c=chang*kuan;
        return  c;
    }

}

class Pillar
{
    Shape dimina;
    int gao;
    public double getVolumn()
    {
        double a=gao*dimina.getArea();
        return a;
    }
}
public class TEST {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Rectangle rectangle=new Rectangle();
        triangle.setChang(12);
        triangle.setKuan(5);
        rectangle.setChang(6);
        rectangle.setKuan(45);
        Pillar Triangular_prism = new Pillar();
        Pillar Rectangle_prism = new Pillar();
        Triangular_prism.dimina=triangle;
        Rectangle_prism.dimina=rectangle;
        Triangular_prism.gao=20;
        Rectangle_prism.gao=20;
        System.out.print("三棱柱体积"+Triangular_prism.getVolumn());
        System.out.print("四棱柱体积"+Rectangle_prism.getVolumn());
    }
}
