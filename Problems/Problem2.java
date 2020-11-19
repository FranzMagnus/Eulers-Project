public class Problem2 {
    public static void main(String[] args) {
        int result = computeEvenFibonacci();
        System.out.println(result); 
    }

    private static int computeEvenFibonacci(){
        int output=0;
        int one = 1;
        int two = 1;
        int sum = 0;
        while(sum < 4000000){
            sum = one+two;
            one = two;
            two = sum;
            if(sum%2 == 0){
                output+=sum;
            }
        }
        return output;
    }
}
