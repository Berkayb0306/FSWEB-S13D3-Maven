package org.example;

public class Wall {
    public double width;
    public double height;

    public Wall(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = (width < 0) ? 0 : width;
    }
    public void setHeight(double height){
        this.height = (height < 0) ? 0 : height;
    }
    public double getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(10,20);
        wall.setHeight(-20);
        wall.setWidth(200);

        System.out.println("area = " + wall.getArea());
        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
