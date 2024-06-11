import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

public class Main {

    public static int inverse_matrix(ArrayList<ArrayList<Integer>> Matrix){



    }

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> Matrix = new ArrayList<>();
        ArrayList<ArrayList<Integer>> Matrix_Final = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){

                Matrix.add(i*10+2*4);

            }
            Matrix_Final.add(Matrix);
        }

        inverse_matrix()

    }
}