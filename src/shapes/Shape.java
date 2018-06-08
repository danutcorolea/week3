package shapes;

import javafx.scene.shape.TriangleMesh;

public abstract class Shape {

    public abstract double computeArea();
    public abstract double computePerimeter();

            
        }



     class Circle extends Shape {
        int center;
        final double pi=3.14;
        int radius;

        public Circle(int x, int y, int radius){

            MyPoint center;
            center = new MyPoint(1,1);
            this.radius=radius;

        }
        public Circle( int center, int radius){
            this.center=center;
            this.radius=radius;
        }


        @Override
         public double computeArea() {
             return pi*radius*radius;
         }
         @Override
         public double computePerimeter() {
             return 2*pi*radius;
         }
     }

     class Rectangle extends Shape {
         int length;
         int width;


         public Rectangle(int length, int width) {
             this.width=width;
             this.length=length;

         }


         @Override
         public double computeArea() {
             return length*width;
         }
         @Override
         public double computePerimeter() {
             return 2*length*width;
         }
     }
     class EquilateralTriangle extends Shape{
    double length;
    final double value=0.43;

    public EquilateralTriangle(int length) {
        this.length = length;
    }
         @Override
         public double computeArea() {
             return value*length*length;
         }
         @Override
         public double computePerimeter() {
             return 3*length;
         }
     }










