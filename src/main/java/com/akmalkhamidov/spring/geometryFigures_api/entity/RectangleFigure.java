package com.akmalkhamidov.spring.geometryFigures_api.entity;

public class RectangleFigure extends GeometryFigure {
  // A lot of methods && constructors are added but not deleted for future cases
    private double sideA;

    private double sideB;


    private String type = "RECTANGLE";

    private double area;

    private double perimeter;

    public RectangleFigure() {
    }

    public RectangleFigure(double aSide, double bSide, String type, double area, double perimeter) {
        this.sideA = aSide;
        this.sideB = bSide;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
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
        setPerimeter(2*(sideA + sideB));
    }

    @Override
    public void findArea() {
        setArea(sideA * sideB);
    }

    @Override
    public boolean isValidFigure() {
        return (this.sideA > 0 && this.sideB > 0);
    }

    @Override
    public String toString() {
        return "RectangleFigure{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
