import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    private static List<Integer> primes = new ArrayList<Integer>();
    public static void main(String[] args) {
        int counter = 2;
        double value = 600851475143D;
        List<Double> factors =  new ArrayList<Double>();
        int result = 0;
        while(factors.stream().reduce((double)1, (a, b) -> a * b) != value){
            if(isPrime(counter)){
                if(value%counter == 0){
                  result = counter;
                  factors.add((double)result);
                }
            }
            counter++;
        }
        System.out.println(result);
    }

    private static boolean isPrime(int i){
        if(i==1){
            return false;
        } else if(i==2){ 
            primes.add(i);
            return true;   
        } else {
            boolean prime = !primes.stream().anyMatch(X -> i%X == 0);
            if (prime){
                primes.add(i); 
                return true;
            } else {
                return false;
            }
        } 
    }
}
