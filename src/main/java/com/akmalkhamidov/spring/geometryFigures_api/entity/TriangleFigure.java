package com.akmalkhamidov.spring.geometryFigures_api.entity;

public class TriangleFigure extends GeometryFigure{

    // A lot of methods && constructors are added but not deleted for future cases

    private double sideA;

    private double sideB;

    private double sideC;

    private String type = "TRIANGLE";

    private double area;

    private double perimeter;

    public TriangleFigure() {
    }

    public TriangleFigure(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public TriangleFigure(double sideA, double sideB, double sideC, String type) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = type;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
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
        this.setPerimeter(sideA + sideB + sideC);
    }

    @Override
    public void findArea() {
        this.findPerimeter();
        double perimeter = this.getPerimeter();
        this.setArea(Math.sqrt(perimeter*(perimeter- sideA)*(perimeter- sideB)*(perimeter- sideC)));
    }

    @Override
    public boolean isValidFigure() {
        return ((sideA>0)&&(sideB>0)&&(sideC>0)&&(sideA+sideB>sideC)&&(sideA+sideC>sideB)&&(sideC+sideB>sideA));
    }

    @Override
    public String toString() {
        return "TriangleFigure{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", type='" + type + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
