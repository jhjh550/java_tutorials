package com.company.t08_inheritance;

/**
 * Created by Mirim on 2015-09-01.
 */
public class InheritanceTest {
    public static void main(String[] args){
        class Parent{
            public String read(){
                return "Parnet 입니다";
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

        FirstChild fc = new FirstChild();
        System.out.println(fc.read());

        SecondChild sc = new SecondChild();
        System.out.println(sc.read());

        ThirdChild tc1 = new ThirdChild(fc);
        System.out.println(tc1.read());

        ThirdChild tc2 = new ThirdChild(sc);
        System.out.println(tc2.read());
    }
}
