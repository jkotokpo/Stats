import java.util.*;

public class Birthday{

}
class Person{
   //1. random number generator
   //2. for loop to add people in array
   //3. nested for loop to compare people
   //4. if 1-1 stop run
   //5. divide count by iterations
    Random random = new Random();
    private int birthday[] = new int[3]; // MM/DD
    
    public Person(){}
        void birthday(int mm, int dd){
            int min = 1;
            int max = 12;
            int dayMax = 31;
            
            mm = random.nextInt(max - min + 1);
            dd = random.nextInt(dayMax - min +1 ) + min;
            //generate that multiple times
            for(int i =1;i<birthday.length;i++){
                mm = random.nextInt(max - min + 1);
                dd = random.nextInt(dayMax - min +1 ) + min;
                
            }
            for(int i =1; i < birthday.length  ; i++){
                birthday[i] = (int) (Math.random()* max - min + 1)+ min;
                //System.out.println(Arrays.toString(birthday));
            for(int j = i -1; j < birthday.length ; j++){
                System.out.println(birthday[i] + "/"+ birthday[j]);
                birthday[j] = (int) (Math.random()* max - min + 1) + min;
                if(birthday[i] == birthday[j]){
                    System.out.println(true);
                   }
                   
                    }
                    
               }
                           
            
        }
        

        
    }
   

class RunBirthday{
    
    public static void main(String [] args){
        Person people = new Person();
        people.birthday(0,0);
        }
    }
