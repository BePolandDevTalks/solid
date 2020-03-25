package com.betse.devtalks.solid;

class Rectangle {
    protected int width, height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        this.width = this.height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

class LiskovDemo {

    static void calculateRectangleArea(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        // expected area: area = 10 * width
        System.out.println("Expected area of " + (width * 10) +
                " got, " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        calculateRectangleArea(rc);

        Square sq = new Square();
        sq.setHeight(5);
        calculateRectangleArea(sq);
    }

}