package com.company;
class circle
{
    private float area;
    private float  perimeter;
    public void setArea(int r)
    {
        area = (3.14f *(r *r));
    }
    public float getArea()
    {
        return area;
    }
    public void setPerimeter(int r)
    {
        perimeter = 2*3.14f*r;
    }
    public float getPerimeter()
    {
        return perimeter;
    }

}
public class circle_area
{
    public static void main(String[] args) {

        circle obj = new circle();
        obj.setArea(5);
        obj.setPerimeter(5);
        System.out.println("Area of circle :"+obj.getArea());
        System.out.println("Perimeter of circle : " +obj.getPerimeter());






    }



}
