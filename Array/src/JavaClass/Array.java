package JavaClass;

import java.util.Random;

public class Array {
    private static final int LENGTH = 6;
    public static void main(String[] arg){

    }

    public static int[] getArray(){
        int[] number = new int[LENGTH];

        Random random = new Random();

        for(int i = 0; i<LENGTH; i++){
            number[i] = random.nextInt(100)+1;
        }
    }
}
