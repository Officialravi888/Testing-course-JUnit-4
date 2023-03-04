package org.example.exemple1;

public class Demo {
    public void show(){
        System.out.println("");
    }
    public static int getArea(int height, int with){
        return height*with;

    }
    public static int getPre(int height, int with){
        return 2*(height+with);
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}
