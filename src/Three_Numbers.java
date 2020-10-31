public class Three_Numbers {

 /*
      1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol

  */

    public static void main(String[] args) {

       double num1=45;
       double num2=67;
       double num3=99;
      if( num3>num1 && num3>num2){
          System.out.println(num3+" is maximum number");
      }
      if(num1<num2 && num1<num3){
          System.out.println(num1+" is minimum number");
      }
      if(num2<num3 && num2>num1){
          System.out.println(num2+" is medium number");
      }

      int guy=18;
      if(guy>=18){
          System.out.println(guy+" is elegible to buy acohol");
      }






    }



}

