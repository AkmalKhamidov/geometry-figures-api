package com.akmalkhamidov.spring.geometryFigures_api.entity;

public class SquareFigure extends GeometryFigure{

   // A lot of methods && constructors are added but not deleted for future cases

    private double sideA;

    private String type = "SQUARE";

    private double area;

    private double perimeter;



    public SquareFigure() {
    }

    public SquareFigure(double sideA, String type, double area, double perimeter) {
        this.sideA = sideA;
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }

    public SquareFigure(double sideA, String type) {
        this.sideA = sideA;
        this.type = type;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    // occurs duplication of "type"

//    public String getType() {
//        return type;
//    }

    public void setType(String type) {
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
        this.setPerimeter(4 * this.sideA);
    }

    @Override
    public void findArea() {
        this.setArea(this.sideA * this.sideA);
    }

    @Override
    public boolean isValidFigure() {
        return this.sideA > 0;
    }

    @Override
    public String toString() {
        return "SquareFigure{" +
                "side=" + sideA +
                ", type='" + type + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
