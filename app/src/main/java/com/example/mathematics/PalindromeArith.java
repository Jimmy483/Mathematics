package com.example.mathematics;

public class PalindromeArith {

    private int number,check,n;

    public PalindromeArith(int number,int check,int n)
    {
        this.number=number;
        this.check=check;
        this.n=n;
    }

    public int checkPal()
    {
        for(int i=0;n>0;i++)
        {
            check=n%10+(check*10);
            n=n/10;


        }
        if(check==number)
        {
            return 1;

        }
        else
        {
            return 0;

        }
    }

}
