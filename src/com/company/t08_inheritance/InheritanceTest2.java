package com.company.t08_inheritance;

/**
 * Created by Mirim on 2015-09-01.
 */
public class InheritanceTest2 {
    public static void main(String[] args){
        class Parent2{
            int i =7;
            public int get(){
                return i;
            }
        }

        class Child2{
            int i=5;
            public int get(){
                return i;
            }
        }



        Parent2 p = new Parent2();
        System.out.println("------------1------------");
        System.out.println(p.i);
        System.out.println(p.get());
    }
}
