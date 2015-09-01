package com.company.t08_inheritance;

/**
 * Created by Mirim on 2015-09-01.
 */
public class InheritanceTest {
    public static void main(String[] args){
        class Parent{
            public String read(){
                return "Parnet ÀÔ´Ï´Ù";
            }
        }

        class FirstChild extends Parent{
            public String read(){
                return super.read()+": firstChild";
            }
        }
    }
}
