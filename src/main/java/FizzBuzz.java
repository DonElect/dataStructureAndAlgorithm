public class FizzBuzz {
    public static void main(String[] args) {
//        fizzBuzzPrint(45);
        forLoopContinued(20);
    }

    /*
    * Given an integer n, for every positive integer i <= n, the task is to print,

    "FizzBuzz" if i is divisible by 3 and 5, i % 3 == 0 && i % 5 == 0
    "Fizz" if i is divisible by 3, i % 3 == 0
    "Buzz" if i is divisible by 5, i % 5 == 0
    "i" as a string, if none of the conditions are true.
    Examples:

    Input: n = 3
    Output: ["1", "2", "Fizz"]

    Input: n = 10
    Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

    Input: n = 20
    Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"]
    * */

    public static void fizzBuzzPrint(int n) {
        /*
        * Step 1: Loop for n-times
        * Step 2: Check if i is divisible by
        * */

        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void forLoopContinued(int num){
        for(int i = num; i >= 1; i = i - 1){
            System.out.println(i);
        }
    }
}
