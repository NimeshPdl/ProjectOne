package com.nimesh.projectone;

public class Arithmetic {

    int first;
    int second;

    public Arithmetic (int first, int second)
    {
        this.first=first;
        this.second=second;
    }

    public int add()
    {
        return first+second;
    }

    public int subtract()
    {
        return first-second;
    }

    public int multiply()
    {
        return first*second;
    }

}
