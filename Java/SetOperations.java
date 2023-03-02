import java.util.*;
public class SetOperations {
        
    public static void main(String [] args){
        ArrayList<String> weekdays = new ArrayList<String>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
    ArrayList<String> weekend = new ArrayList<String>();
        weekend.add("Friday");
        weekend.add("Saturday");
        weekend.add("Sunday");
        

        System.out.println("Union: "  + weekdays.addAll(weekend)+ weekdays);

        System.out.println("Intersect: " );
        } 

    
}