package com.wet.featsoflove.showcase.hellojava;

public class HelloJava
{
    public void sayHello(String arg)
    {
        System.out.println("Hello " + arg);
    }

    public static void main(String[] args)
    {
        HelloJava helloJava = new HelloJava();
        helloJava.sayHello(args[0]);
    }
}