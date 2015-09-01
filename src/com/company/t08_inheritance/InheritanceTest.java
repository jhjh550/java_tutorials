package com.company.t08_inheritance;

/**
 * Created by Mirim on 2015-09-01.
 */
public class InheritanceTest {
    public static void main(String[] args){
        class Parent{
            public String read(){
                return "Parnet ¿‘¥œ¥Ÿ";
            }
        }

        class FirstChild extends Parent{
            public String read(){
                return super.read()+": firstChild";
            }
        }

        class SecondChild extends Parent{
            public String read(){
                return super.read()+": secondChild";
            }
        }

        class ThirdChild extends Parent{
            Parent p;
            public ThirdChild(Parent p){
                this.p = p;
            }

            public String read(){
                return p.read()+": thirdChild";
            }
        }
    }
}
