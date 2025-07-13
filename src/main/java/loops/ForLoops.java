package loops;

public class ForLoops {
    public static void main(String[] args) {
//        basicForLoop();
        forEachLoop(new int[]{10, 2, 33, 4, 5});
    }

    public static void basicForLoop() {
        String name = "EMMANUEL";
                                                      // 0, 1, 2, 3, 4, 5, 6, 7
        String[] nameLetters = name.split(""); // {E, M, M, A, N, U, E, L}

        System.out.println("Start of FOR loop");

        for(int i = 0; i < nameLetters.length; i++){
            // Print each character
            String letter = nameLetters[i];

            System.out.println("Letter: " + letter +" position: " + i);
        }

        System.out.println("End of FOR loop");
    }

    public static void basicForLoop2(int[] numbers){

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Number: " + numbers[i]);
        }
    }

    public static void forEachLoop(int[] numbers){

        for(int num :  numbers){
            System.out.println("Number: " + num);
        }
    }
}
