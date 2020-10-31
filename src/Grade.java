import sun.plugin.javascript.JSContext;

public class Grade {
    /*
     write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good

     */
    public static void main(String[] args) {
        int grade=55;

        if (grade>90 && grade <=100 ){
            System.out.println("Excellent");
        }
        if (grade>=70 && grade <=90){
            System.out.println("Good");
        }
        if (grade>60 && grade <= 70){
            System.out.println("Pass");
        }
        if (grade<=60){
            System.out.println("Fail");
        }

/*
  Write a program that can calcuate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B

 */
     int score= 44;

     if(score >=90 && score <=100){
         System.out.println("Your grade is A");

     }
     if (score>=80 && score<=90){
         System.out.println("Your grade is B");
     }
     if (score >=80 && score<-70){
         System.out.println("Your grade is C");
     }
     if (score >=70 && score <=60){
         System.out.println("Your grade is D");
     }
     if (score <60 ){
         System.out.println("Your grade is F");
     }

        System.out.println("===========================");


        if (score >= 90 && score <= 100) {
            System.out.println("your score is A");
        }else if(score >=80 && score <=90){
            System.out.println("your score is B");
        }else if(score >=70 && score <=80){
            System.out.println("your score is C");
        }else if(score>=60 && score <=70){
            System.out.println("your score is D");
        }else{
            System.out.println("your score is F");
        }



    }


}



