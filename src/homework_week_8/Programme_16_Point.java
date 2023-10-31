package homework_week_8;

import java.awt.*;

public class Programme_16_Point {
    private int x;
    private int y;
    //constructor
    public Programme_16_Point() {
    } // no-arg constructor

    public Programme_16_Point(int x, int y) {   //Parameterized constructor
        this.x = x;
        this.y = y;
    }

    //instance methods
    //getters


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() { //method without parameters
        return distance(0, 0);
    }

    public double distance(int x, int y) {    //returns distance btn this points(x,y)
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

    }

    public double distance(Point another) {          //returns distance btn this point & another point
        return distance(another.x, another.y);
    }//end of instance methods


    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6,5);
        Programme_16_Point second = new Programme_16_Point(3,1);
        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(second)=" + first.distance());
        System.out.println("distance(2,2)=" + first.distance(2,2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance()=" + point.distance());


    }
}
