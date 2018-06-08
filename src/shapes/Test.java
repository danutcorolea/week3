package shapes;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        double totalarea=0;
        double totalperimeter=0;
        Shape [] shapes ={new Circle(1,3),new Rectangle(10,8),new EquilateralTriangle(8)};


        for (Shape shape :shapes) {
            totalarea+=shape.computeArea();

            }
        System.out.println("total area is " + totalarea);
        for (Shape shape:shapes) {
            totalperimeter+=shape.computePerimeter();
        }
        System.out.println("total area is " + totalperimeter);



        }

    }















