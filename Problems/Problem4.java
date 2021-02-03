public class Problem4 {
    public static void main(String[] args) {
        int result = compute();
        if(result != 0){
            System.out.println(result);
        } else {
            System.out.println("Computation Errror!");
        }
    }

    private static int compute(){
        for(int i=999; i>=100; i++){
            for(int j=999; j>=100; j++){
                if(isPalindrome(i*j)){
                    return i*j;
                }
            }
        }
        return 0;
    }


    private static boolean isPalindrome(int input){
        return false;
    }
}
