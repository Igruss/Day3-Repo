public class Baby {
    /*
    write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                    if age > 150 or less than 0 ==> invalid entry

     */
    public static void main(String[] args) {
       int age = 39;
       String group = " ";

       if( age <=2){
           group = "Baby";
       } else if (age > 2 && age < 6) {
           group = "Toddler";
       } else if (age > 5 && age < 10) {
           group = "Kid";
       } else if (age > 9 && age < 13) {
           group ="Pre-Teen";
       } else if (age > 12 && age < 18) {
           group="Teenager";
       } else if (age > 17 && age < 21) {
           group="Young Adult";
       } else if (age > 20 && age < 40) {
           group = "Adult";
       } else if (age > 39 && age < 50) {
           group = "Young Middle-Aged Adult";
       } else if (age > 49 && age < 55) {
           group = "Middle-Aged Adult";
       } else if (age > 54 && age < 65) {
           group= "Very Young Senior Citizen";
       } else if (age > 64 && age < 75) {
           group="Young Senior Citizen";
       } else if (age > 74 && age < 85) {
           group="Senior Citizen";
       } else if (age >= 85 && age <150) {
           group="Old Senior Citizen";
       }else {
           group="Invalid Entry";
        }

        System.out.println(group);







    }
}
