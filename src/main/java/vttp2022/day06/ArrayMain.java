package vttp2022.day06;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {

        String[] lines = new String[10];

        int[][] intMatrix = {
            {1, 1, 1, 1, 1},
            {2, 4, 6, 8, 0},
            {9, 8, 7, 6, 5}
        }; 

        int[][] subMatrix = new int[2][2];

        subMatrix[0][0] = intMatrix[0][0]*5;
        subMatrix[0][1] = intMatrix[0][1]*5;
        subMatrix[1][0] = intMatrix[1][0]*5;
        subMatrix[1][1] = intMatrix[1][1]*5;
        //System.out.println(Arrays.deepToString(subMatrix));

        int[][] intMatrix2 = new int[3][];
        // intMatrix2[0] = new int[3];
        // intMatrix2[1] = new int[2];
        // intMatrix2[2] = new int[3];
        for (int i = 0; i < intMatrix2.length; i++) {
            // This is to set the column size
            // This means for the row of intMatrix2[0], the array for that row is 3 so on and so forth
            intMatrix2[i] = new int[3];
            intMatrix2[i][0] = i;
            intMatrix2[i][1] = i;
            intMatrix2[i][2] = i;
        }
        //System.out.println(Arrays.deepToString(intMatrix2));

        int[][] intMatrix3 = new int[3][];
        for (int i = 0; i < intMatrix3.length; i++) {
            // Eg For the row mat3[0], the column only has 1 value
            intMatrix3[i] = new int[i + 1];
        }
        System.out.println(Arrays.deepToString(intMatrix3));

        // 3 x 3 matrix of float
        float[][] mat2 = new float[3][3];

        float[][] mat = new float[3][];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = new float[3];
            mat[i][0] = i;
            mat[i][1] = i;
            mat[i][2] = i;
        }

        float[][] mat3 = new float[3][];
        for (int i = 0; i < mat3.length; i++) {
            // Eg For the row mat3[0], the column only has 1 value
            mat3[i] = new float[i + 1];
        }

    }
    
}
