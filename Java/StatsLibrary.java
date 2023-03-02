import java.util.*;
import java.lang.Math;
import java.lang.reflect.Array;

class StatsLibrary {
    private int minimum ;
    private int maximum ;
    private double sum; 
    private static int[] numbers = new int [7];
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    public StatsLibrary() {
    }

    public void mean(){
        System.out.println("List the numbers");
        for(int i = 0; i < numbers.length; i++){
             numbers[i] = keyboard.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        sum = Arrays.stream(numbers).sum();
        System.out.println((sum / numbers.length));
    }    
    
    public void median(){
        Arrays.sort(numbers);
        double median;
        for(int i = 0; i < numbers.length; i++){
        numbers[i] = keyboard.nextInt();
        }
        if (numbers.length % 2 == 0){
            median = (numbers[numbers.length/2]) + (numbers[numbers.length/2 - 1])/2;
        }
        else{
            median = numbers[numbers.length/2];
        }
        System.out.println(median);
        }
        
    public  void mode(){
    int[] count = new int[101];

    //count the occurrences
    for (int i=0; i < numbers.length; i++) {
        numbers[i] = keyboard.nextInt();
        count[numbers[i]]++;
    }
    //go backwards and find the count with the most occurrences
    int index = count.length-1;
    for (int i=count.length-2; i >=0; i--) {
        if (count[i] >= count[index])
            index = i;
        
    }
    System.out.print(index);

    }


    public void standardDeviation(){
        double deviation;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = keyboard.nextInt();   
        }
        System.out.println(Arrays.toString(numbers));
        sum = Arrays.stream(numbers).sum();
        deviation = Math.sqrt((sum)/(numbers.length));
        System.out.println(deviation);
    }
    public static long combinations(int n, int k) {
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - k + i) / i;
        }
        System.out.println(result);
        return result;
    }
    
    public void Permutation(){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        for(int i = 0; i < list.size(); i++){
            int j;
        }
    
    public void Complement(){

    }
 class Main {
    public static void main(String[] args) {
        StatsLibrary stats = new StatsLibrary();
        stats.combinations();
    }
}
}