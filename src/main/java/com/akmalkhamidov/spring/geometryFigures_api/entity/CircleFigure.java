package com.akmalkhamidov.spring.geometryFigures_api.entity;

public class CircleFigure extends GeometryFigure{

    // A lot of methods && constructors are added but not deleted for future cases


    private double radius;

    private String  type = "CIRCLE";

    private double area;

    private double perimeter;

    public CircleFigure() {
    }

    public CircleFigure(double radius, String type, double area, double perimeter) {
        this.radius = radius;
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // occurs duplication of "type"
//    public String  getType() {
//        return type;
//    }

    public void setType(String  type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void findPerimeter() {
        setPerimeter((2*radius*Math.PI));
    }

    @Override
    public void findArea() {
        setArea((radius*radius*Math.PI));
    }

    @Override
    public boolean isValidFigure() {
        return this.radius > 0;
    }

    @Override
    public String toString() {
        return "CircleFigure{" +
                "radius=" + radius +
                ", type='" + type + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
