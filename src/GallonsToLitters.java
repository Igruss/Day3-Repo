public class GallonsToLitters {
    /*
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
     */


    public static void main(String[] args) {

        double gallon = 1;
        double litter = gallon*3.785;

        System.out.println(litter);

        double lit = 1;
        double gal =lit/3.785;

        System.out.println(gal);

        int a=200;
        int b=-a++ + - --a * a-- % 2;
        // -200 + -200 * 200  % 2==-200

        System.out.println(b);

        int x=300;
        int y=400;
        int z = x + y - x * y +x / y;
        //z=300+400 - 300*400 + 300 / 400 = 700 - 120000 + 0.75 = - 119300 +0.75= -119300

        System.out.println(z);












    }




}
