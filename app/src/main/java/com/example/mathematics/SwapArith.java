package com.example.mathematics;

public class SwapArith {

    private int a;
    private int b;

    public SwapArith(int a,int b)
    {
        this.a=a;
        this.b=b;

    }

    public int swapA()
    {
        b=a+b;
        a=b-a;
        return a;
    }

    public int swapB()
    {
        b=b-a;
        return b;
    }

}
