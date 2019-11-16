package com.example.mathematics;

public class CircleArith {

    private float radius;
    private float area;

    public CircleArith(float radius)
    {
        this.radius=radius;
    }

    public float area()
    {
        area=22/7*radius*radius;
        return area;
    }
}
