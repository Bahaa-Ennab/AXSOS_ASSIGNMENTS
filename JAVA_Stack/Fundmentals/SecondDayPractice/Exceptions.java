public class Exceptions {
    public static void main(String[] args){
        int[] numbers = {5, 10, 50, 0, 2};
        try{
            for(int i = 0; i<=100;i++){
                int sum=100/ numbers[i];
                System.out.println(sum);
        }
        }
        catch (ArithmeticException e){
            System.out.println("can't divide by zero");

        }
        // Use a for loop to divide 100 by each number and print the quotient
        // Use a try/catch block to prevent a crash due to a zero division error (ArithmeticException)
        // Handle the exception by printing 'Cannot divide by zero.'
    }
}