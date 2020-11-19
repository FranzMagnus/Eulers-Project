import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        System.out.println("Please enter Number");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int value = Integer.parseInt(input);
        int result = computeMultiples(value);
        System.out.println(result); 
    }

    private static int computeMultiples(int input){
        int output = 0;
        for(int i=1; i<input; i++){
            if(i%3 == 0 || i%5 == 0){
                output+=i;
            }
        }
        return output;
    }
}