import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Month {
/*
. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */
    public static void main(String[] args) {

        int month = 66;

        if (month == 2) {
            System.out.println("28 Days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        System.out.println("31 Days");
        }else{
            System.out.println("Invalid");
        }
        System.out.println(month);

        System.out.println("================");

        int x= 10;
        int y=x++;

        


    }

}




