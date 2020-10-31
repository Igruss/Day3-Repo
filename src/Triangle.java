public class Triangle {
    /*
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.

        Note: MUST use if&else statement

    */

    public static void main(String[] args) {

        double a=55;
        double b=65;
        double c=69;

        if(a+b+c==180){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is not valid");
        }
        System.out.println("==========================");

        /*
        write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters
         */

        int char1='L';
        int char2='L';

        if(char1==char2 ){
            System.out.println("Same characters");
        }else{
            System.out.println("Different characters");
        }
        System.out.println(("==================="));

        /*
        3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false

         */

        double model= 1994;

        if(model>=1995 && model<=1998 && model>=2001 && model<=2002 && model<=2004 && model>=2006 && model<=2015 && model>=2017){
            System.out.println("True");
        }else{
            System.out.println("False");
        }











    }



}
