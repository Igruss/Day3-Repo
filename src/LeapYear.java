public class LeapYear {
    /*
      1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year
    2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
Colla
     */

    public static void main(String[] args) {

        short year=2020;
        boolean leapYear=true;

        leapYear=year%4==0;

        System.out.println(year+"is a leap year: "+leapYear);

        byte num1=65;

        boolean num2=num1%2==0;
        boolean num3=num1%3==0;
        boolean num4=num1%5==0;

        System.out.println(num1+" is evenly divisible by 2: "+num2);
        System.out.println(num1+" is evenly divisible by 3: "+num3);
        System.out.println(num1+" is evenly divisible by 5: "+ num4);








    }






}

