package com.example.mathematics;

public class ReverseArith {

    private int num;
    private int rev;

    public ReverseArith(int num,int rev)
    {
        this.num=num;
        this.rev=rev;


    }

    public int rev()
    {
        for(int i=0;num>0;i++)
        {
            rev=num%10+(rev*10);
            num=num/10;


        }

        return rev;
    }


}
